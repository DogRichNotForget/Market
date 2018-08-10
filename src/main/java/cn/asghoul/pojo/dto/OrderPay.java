package cn.asghoul.pojo.dto;

import java.util.List;

public class OrderPay {

//    收货人姓名：name,
    private String name;
//    收货人电话：telphone,
    private String telphone;
//    收货人地址：address,
    private String address;
//    订单金额：money
    private float money;
//    订单商品详情列表
    private List<OrderPayItems> orderItem;
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

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public List<OrderPayItems> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderPayItems> orderItem) {
        this.orderItem = orderItem;
    }
}
