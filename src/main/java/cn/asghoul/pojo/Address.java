package cn.asghoul.pojo;

import java.math.BigInteger;

/*
 * 地址表：adress
 */
public class Address {


    private BigInteger addressId;//地址id
    private BigInteger clientId;//用户id
    private String address;//地址
    private String telphone;//收货人电话
    private int defaultAddress;//默认地址状态
    private String name;//收货人姓名

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

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ",clientId='" + clientId + '\'' +
                ",address='" + address + '\'' +
                ",telphone='" + telphone + '\'' +
                "itemType='" + defaultAddress + '\'' +
                "name='" + name + '\'' +
                "}";

    }
}