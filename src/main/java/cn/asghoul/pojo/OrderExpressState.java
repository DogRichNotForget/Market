package cn.asghoul.pojo;

import java.math.BigInteger;

/*
    物流表
 */
public class OrderExpressState {

//    订单Id     orderId
    private BigInteger orderId;
//    物流状态   expressState
    private int expressState;

    public BigInteger getOrderId() {
        return orderId;
    }

    public void setOrderId(BigInteger orderId) {
        this.orderId = orderId;
    }

    public int getExpressState() {
        return expressState;
    }

    public void setExpressState(int expressState) {
        this.expressState = expressState;
    }
}
