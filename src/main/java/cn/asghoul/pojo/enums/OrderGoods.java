package cn.asghoul.pojo.enums;

import java.math.BigInteger;

/*
    订单商品表
 */
public class OrderGoods {

//    订单号：orderId
    private BigInteger orderId;
//    支付状态:paystate
    private int paydtate;

    public BigInteger getOrderId() {
        return orderId;
    }

    public void setOrderId(BigInteger orderId) {
        this.orderId = orderId;
    }

    public int getPaydtate() {
        return paydtate;
    }

    public void setPaydtate(int paydtate) {
        this.paydtate = paydtate;
    }
}
