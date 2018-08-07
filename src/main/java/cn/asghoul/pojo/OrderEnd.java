package cn.asghoul.pojo;

import java.math.BigInteger;

/*
    超时和成功支付的订单的订单
 */
public class OrderEnd {

//    订单号：orderId
    private BigInteger orderId;
//    支付状态:payState
    private int payState;//(0是已支付，1是未支付)

    public BigInteger getOrderId() {
        return orderId;
    }

    public void setOrderId(BigInteger orderId) {
        this.orderId = orderId;
    }

    public int getPayState() {
        return payState;
    }

    public void setPayState(int payState) {
        this.payState = payState;
    }
}
