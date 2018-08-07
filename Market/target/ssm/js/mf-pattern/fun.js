//Ok!!
function addUser() {
    var username = $("#username").val();
    var password = $("#password").val();
    var email = $("#email").val();
    var role = $("#role").val();
    var user = {
        "username": username,
        "password": password,
        "email": email,
        "role": role
    };
    var _url = "http://localhost:8080/ChatRobot/user/showUser";
    $.ajax({
        url: _url,
        type: "POST",
        data: user,
        contentType: "application/x-www-form-urlencoded",
    }).done(function (data) {
        if (data == "该账号已经注册过！") {
            alert("该账号已经注册过！");
            return false;
        } else {
            window.sessionStorage.setItem("user", data);
            window.location.replace("http://localhost:8080/ChatRobot/user_index.html");
        }
    }).fail(function (res) {
        alert("注册失败！");
    });
}

//Ok!!
function loginUser() {
    var password = $("#password").val();
    var email = $("#email").val();
    var role = $("#role").val();
    var user = {
        "password": password,
        "email": email,
        "role": role
    };
    var _url = "http://localhost:8080/ChatRobot/user/loginUser";
    $.ajax({
        url: _url,
        type: "GET",
        data: user,
        contentType: "application/x-www-form-urlencoded",
    }).done(function (data) {
        if (data == "密码输入错误！") {
            alert("密码错误！");
            return false;
        } else if (data == "账号不存在！") {
            alert("账号不存在！");
            return false;
        } else {
            window.sessionStorage.setItem("user", data);
            window.location.replace("http://localhost:8080/ChatRobot/user_index.html");
        }
    }).fail(function (res) {
        alert("登录失败！");
    });
}

//Ok!!!
function updateUser() {
    var user = {
        "id": $("#id").val(),
        "username": $("#username").val(),
        "password": $("#password").val(),
        "email": $("#email").val(),
        "role": $("#role").val(),
        "status": $("#status").val(),
        "regTime": new Date(),
        "regIp": $("#regIp").val()
    };
    console.log(user);
    var _url = "http://localhost:8080/ChatRobot/user/updateUser";
    $.ajax({
        url: _url,
        type: "POST",
        data: user,
        contentType: "application/x-www-form-urlencoded",
    }).done(function (data) {
        window.location.replace("http://localhost:8080/ChatRobot/user_info.html");
    }).fail(function (res) {
        window.location.replace("http://localhost:8080/ChatRobot/user_info.html");
    });
}

//Ok!!!
function removeUser(id) {
    var _url = "http://localhost:8080/ChatRobot/user/removeUser";
    alert("第" + id + "条数据已被删除！");
    $.ajax({
        type: "DELETE",
        url: _url + "/" + id,
        dataType: "json",
        success: function (data) {
            window.location.reload();
        },
        error: function (res) {
            window.location.reload();
        }
    });
}

//Ok!!!
function removeSession() {
    window.sessionStorage.removeItem("user");
}
