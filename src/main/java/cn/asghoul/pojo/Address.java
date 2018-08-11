package cn.asghoul.pojo;

public class Address {
    int addressId;
    String email;
    String address;
    String telphone;
    String name;
    int defaultAddress;
    int clientId;
    public Address(){}
    public Address(int addressId, String email, String address, String telphone, String name, int defaultAddress, int clientId){
        this.addressId=addressId;
        this.email=email;
        this.address=address;
        this.telphone=telphone;
        this.name=name;
        this.defaultAddress=defaultAddress;
        this.clientId=clientId;
    }

    public int getAddressid() {
        return addressId;
    }

    public void setAddressid(int addressId) {
        this.addressId = addressId;
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

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "Address [addressId=" + addressId + ", email=" + email + ", Address="
                + address + ", telphone=" + telphone + ", name=" + name + ", defaultAddresss=" + defaultAddress +
                ", clientId=" + clientId + "]";
    }
}
