package com.xianxu.pojo;

public class address {
    int addressid;
    String email;
    String address;
    String telphone;
    String name;
    int defaultAddress;
    public address(){}
    public address(int addressid,String email,String address,String telphone,String name,int defaultAddress){
        this.addressid=addressid;
        this.email=email;
        this.address=address;
        this.telphone=telphone;
        this.name=name;
        this.defaultAddress=defaultAddress;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(int defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    @Override
    public String toString() {
        return "address [addressId=" + addressid + ", email=" + email + ", address="
                + address + ", telphone=" + telphone + ", name=" + name + ", defaultAddresss=" + defaultAddress +"]";
    }
}
