package cn.asghoul.pojo;

import java.math.BigInteger;
import java.sql.Timestamp;

/*
    订单支付表
 */
public class PayState {


//    订单号：orderid
    private BigInteger orderId;
//    支付状态：paystate
    private  int payState;//(0是未支付，1是已支付)
//    创建时间：createTime
    private Timestamp createTime;
//    结束时间：endTime
    private Timestamp endTime;

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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }
}
