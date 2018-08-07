package cn.asghoul.pojo;

import java.math.BigInteger;

/*
    收货地址表
 */
public class Address {

//    地址id：addressId
    private BigInteger addressId;
//    用户id：clientId
    private BigInteger clientId;
//    地  址：address
    private String address;
//    收货人电话：telphone
    private String telphone;
//    默认地址状态：defaultAddress
    private int defaultAddress;//(0为默认地址，1位非默认地址)
//    收货人姓名：name
    private String name;

    public BigInteger getAddressId() {
        return addressId;
    }

    public void setAddressId(BigInteger addressId) {
        this.addressId = addressId;
    }

    public BigInteger getClientId() {
        return clientId;
    }

    public void setClientId(BigInteger clientId) {
        this.clientId = clientId;
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

    public int getDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(int defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
