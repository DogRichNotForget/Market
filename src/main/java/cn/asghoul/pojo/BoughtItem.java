package cn.asghoul.pojo;

import java.math.BigInteger;
import java.sql.Timestamp;

/*
    买入的商品表

 */
public class BoughtItem {

//   客户Id: clientId
    private BigInteger clientId;
//   商品Id:  itmeId
    private BigInteger itemId;
//   交易时间： endTime
    private Timestamp endTime;

    public BigInteger getClientId() {
        return clientId;
    }

    public void setClientId(BigInteger clientId) {
        this.clientId = clientId;
    }

    public BigInteger getItemId() {
        return itemId;
    }

    public void setItemId(BigInteger itemId) {
        this.itemId = itemId;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }
}
