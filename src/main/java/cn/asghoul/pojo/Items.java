package cn.asghoul.pojo;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Items {
//    商品id：itemId
    private BigInteger itemId;
//    上架时间：launchTime
    private Timestamp launchTime;
//    商品名称：itemName
    private String itemName;
//    商品价格：price
    private float price;
//    类型：itemType
    private int itemType;
//    描述：descr
    private String descr;
//    图片：pic
    private String pic;
//    卖家id：clientId
    private BigInteger clientId;

    public BigInteger getItemId() {
        return itemId;
    }

    public void setItemId(BigInteger itemId) {
        this.itemId = itemId;
    }

    public Timestamp getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(Timestamp launchTime) {
        this.launchTime = launchTime;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public BigInteger getClientId() {
        return clientId;
    }

    public void setClientId(BigInteger clientId) {
        this.clientId = clientId;
    }
}
