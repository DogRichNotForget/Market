package cn.asghoul.pojo;

import java.math.BigInteger;
import java.sql.Timestamp;
/*
    订单表
 */
public class Order {
//
//    订单号：orderId
    private BigInteger orderId;
//    地址id：addressId
    private BigInteger addressId;
//    支付状态：payState
    private int patState;//(0是已支付，1是未支付)
//    订单金额：money
    private float money;
//    产生时间：createTime
    private Timestamp cteateTime;
//    结束时间：endTime
    private Timestamp endTime;
//    卖家Id: clientId
    private BigInteger clientId;



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

    public int getPatState() {
        return patState;
    }

    public void setPatState(int patState) {
        this.patState = patState;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Timestamp getCteateTime() {
        return cteateTime;
    }

    public void setCteateTime(Timestamp cteateTime) {
        this.cteateTime = cteateTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public BigInteger getClientId() {
        return clientId;
    }

    public void setClientId(BigInteger clientId) {
        this.clientId = clientId;
    }
}
