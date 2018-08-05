package com.pojo;


import java.util.Date;

public class User {

    private long clientid; //用户id
    private String email;   //邮箱
    private String password;    //密码
    private String name;        //昵称
    private String telephone;   //电话
    private String pic;         //图片
    private String sex;         //性别
    private Date old;           //年龄
    private String prsign;   //个性签名

    public long getClientid() {
        return clientid;
    }

    public void setClientid(long clientid) {
        this.clientid = clientid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getOld() {
        return old;
    }

    public void setOld(Date old) {
        this.old = old;
    }

    public String getPrsign() {
        return prsign;
    }

    public void setPrsign(String prsign) {
        this.prsign = prsign;
    }





}

