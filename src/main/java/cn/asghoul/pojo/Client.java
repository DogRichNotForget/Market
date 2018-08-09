package cn.asghoul.pojo;

import java.math.BigInteger;

public class Client {
    private int clientId;// 用户id
    private String email;//邮箱
    private String password;// 密码
    private String name;//昵称
    private String telphone;//电话
    private String pic;//图片
    private String sex;//性别
    private int old;// 年龄
    private String prsign;//个性签名

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telephone) {
        this.telphone = telephone;
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

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getPrsign() {
        return prsign;
    }

    public void setPrsign(String prsign) {
        this.prsign = prsign;
    }
    @Override
    public String toString(){
        return "Items{"+
                ",clientId='"+clientId+'\''+
                ",email='"+ email+'\''+
                ",password='"+password+'\''+
                ",name='"+name+'\''+
                ",telphone='"+telphone+'\''+
                ",pic='"+pic+'\''+
                ",sex='"+sex+'\''+
                ",old='"+old+'\''+
                ",prsign='"+prsign+'\''+
                "}";
    }

}