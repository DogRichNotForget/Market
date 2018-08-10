package cn.asghoul.pojo.dto;

public class AddressPay {

//    收货人姓名：name,
    private String name;
//    收货人电话：telphone,
    private String telphone;
//    收货人地址：address
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
