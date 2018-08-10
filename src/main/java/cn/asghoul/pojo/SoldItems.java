package cn.asghoul.pojo;

import java.math.BigInteger;
import java.sql.Timestamp;

/*
    卖出的商品表

 */
public class SoldItems {

//   客户Id：clientId
    private BigInteger clietId;
//  商品Id:  itemId;
    private BigInteger itemId;
//   交易时间：   endTime
    private Timestamp endTime;

    public BigInteger getClietId() {
        return clietId;
    }

    public void setClietId(BigInteger clietId) {
        this.clietId = clietId;
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
