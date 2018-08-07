package com.xianyu.pojo;

public class client {
    int clientId;
    String email;
    String password;
    String name;
    String telphone;
    String pic;
    char sex;
    int old;
    String prsign;

    public client(){}
    public client(int clientId,String email,String password,String name,String telphone,String pic,char sex,int old, String prsign){
        this.clientId=clientId;
        this.email=email;
        this.password=password;
        this.name=name;
        this.telphone=telphone;
        this.pic=pic;
        this.sex=sex;
        this.old=old;
        this.prsign=prsign;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
    public String getpassword() {
        return password;
    }
    public void setpassword(String password) {
        this.password = password;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String gettelphone() {
        return telphone;
    }
    public void settelphone(String telephone) {
        this.telphone = telephone;
    }
    public String getpic() {
        return pic;
    }
    public void setpic(String pic) {
        this.pic = pic;
    }
    public char getsex() {
        return sex;
    }
    public void setsex(char sex) {
        this.sex = sex;
    }
    public int getold() {
        return old;
    }
    public void setold(int old) {
        this.old = old;
    }
    public String getprsign() {
        return prsign;
    }
    public void setprsign(String prsign) {
        this.prsign = prsign;
    }

    @Override
    public String toString(){
        return "client [clientId=" + clientId + ", email=" + email + ", password="
                + password + ", name=" + name + ", telphone=" + telphone + ", pic=" + pic
                + ", sex=" + sex + ", old=" + old + ", prsign=" + prsign +"]";
    }
}
