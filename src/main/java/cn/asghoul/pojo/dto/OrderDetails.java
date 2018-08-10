package cn.asghoul.pojo.dto;

import cn.asghoul.pojo.Items;

import java.math.BigInteger;
import java.util.List;

public class OrderDetails {

    //订单Id： orderId
    private BigInteger orderId;
    //地址Id:  addressId
    private BigInteger addressId;
    //订单金额：money
    private float money;
    //卖家Id:  clientId
    private BigInteger clientId;
    //订单中所有商品Id:  List<items>
    private List<Items> itemsId;

    public BigInteger getOrderId() {
        return orderId;
    }

    public void setOrderId(BigInteger orderId) {
        this.orderId = orderId;
    }

    public BigInteger getAddressId() {
        return addressId;
    }

    public void setAddressId(BigInteger addressId) {
        this.addressId = addressId;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public BigInteger getClientId() {
        return clientId;
    }

    public void setClientId(BigInteger clientId) {
        this.clientId = clientId;
    }

    public List<Items> getItemsId() {
        return itemsId;
    }

    public void setItemsId(List<Items> itemsId) {
        this.itemsId = itemsId;
    }
}