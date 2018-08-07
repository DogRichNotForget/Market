package cn.asghoul.pojo;

import java.math.BigInteger;
/*
    订单商品表

 */
public class OrderItem {

//    订单id：orderId
    private BigInteger orderId;
//    商品id：itemId
    private  BigInteger itemId;

    public BigInteger getOrderId() {
        return orderId;
    }

    public void setOrderId(BigInteger orderId) {
        this.orderId = orderId;
    }

    public BigInteger getItemId() {
        return itemId;
    }

    public void setItemId(BigInteger itemId) {
        this.itemId = itemId;
    }
}
