package com.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    private long userId;
    private ObjectMapper mapper;

    //Ok!!!
    @RequestMapping(value = "/showUser/{id}", method = RequestMethod.GET)
    public void getUser(@PathVariable String id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(id);
        User user = this.userService.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }

    //Ok!!!!
    @RequestMapping(value = "/loginUser", method = RequestMethod.GET)
    public void loginUser(User loginUser, HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        User user = this.userService.selectUserByEmail(loginUser.getEmail());
        ObjectMapper mapper = new ObjectMapper();
        if (user == null) {
            response.getWriter().write("账号不存在！");
        } else if (!loginUser.getPassword().equals(user.getPassword())) {
            response.getWriter().write("密码输入错误！");
        } else {
            response.getWriter().write(mapper.writeValueAsString(user));
        }
        response.getWriter().close();
    }

    //Ok!!!!
    @RequestMapping(value = "/allUser", method = RequestMethod.GET)
    public void allUser(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        List<User> userList = userService.selectAllUser();
        String userMsg = "";
        for (User user : userList) {
            userMsg = userMsg + "<tr>";
            userMsg = userMsg + "<td>" + user.getId() + "</td>";
            userMsg = userMsg + "<td>" + user.getUsername() + "</td>";
            userMsg = userMsg + "<td>" + user.getPassword() + "</td>";
            userMsg = userMsg + "<td>" + user.getEmail() + "</td>";
            userMsg = userMsg + "<td>" + user.getRole() + "</td>";
            userMsg = userMsg + "<td>" + user.getStatus() + "</td>";
            userMsg = userMsg + "<td>" + user.getRegTime() + "</td>";
            userMsg = userMsg + "<td>" + user.getRegIp() + "</td>";
            userMsg = userMsg + "<td><input type='button' value='删 除' onclick='removeUser(" + user.getId() + ")'/></td>";
            userMsg = userMsg + "</tr>";
        }
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(userMsg));
    }

    //Ok!!!!
    @RequestMapping(value = "/showUser", method = RequestMethod.POST)
    public void postUser(User registUser, HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        User user = this.userService.selectUserByEmail(registUser.getEmail());
        if (user != null) {
            response.getWriter().write("该账号已经注册过！");
        } else {
            registUser.setStatus(1);
            registUser.setRegTime(new Date());
            registUser.setRegIp("127.0.0.6");
            this.userService.addUser(registUser);
            response.getWriter().write(mapper.writeValueAsString(user));
        }
        response.getWriter().close();
    }

    //Ok!!!
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public void putUser(User updateUser, HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        System.out.println(updateUser.getUsername());
        System.out.println(updateUser.getPassword());
        ObjectMapper mapper = new ObjectMapper();
        User user = this.userService.modifyUser(updateUser);
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }

    //Ok!!!!
    @RequestMapping(value = "/removeUser/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable String id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(id);
        this.userService.removeUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write("remove success!");
        response.getWriter().close();
    }

}
