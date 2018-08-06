package cn.asghoul.pojo;

import java.math.BigInteger;
import java.sql.Timestamp;
/*
    订单表
 */
public class OrderTotal {

/* 订单号：orderId */
    private BigInteger orderId;
//    买家id：clientId
    private BigInteger clientId;
//    支付状态：payState
    private int payState;
//    订单金额：money
    private float money;
//    产生时间：createTime
    private Timestamp createTime;
    // 评价状态：commentState
    private int commentState;
    // 物流状态;expressState
    private int expressState;
//    结束时间：endTime
    private Timestamp endTime;

    public BigInteger getOrderId() {
        return orderId;
    }

    public void setOrderId(BigInteger orderId) {
        this.orderId = orderId;
    }

    public BigInteger getClientId() {
        return clientId;
    }

    public void setClientId(BigInteger clientId) {
        this.clientId = clientId;
    }

    public int getPayState() {
        return payState;
    }

    public void setPayState(int payState) {
        this.payState = payState;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public int getCommentState() {
        return commentState;
    }

    public void setCommentState(int commentState) {
        this.commentState = commentState;
    }

    public int getExpressState() {
        return expressState;
    }

    public void setExpressState(int expressState) {
        this.expressState = expressState;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }
}
