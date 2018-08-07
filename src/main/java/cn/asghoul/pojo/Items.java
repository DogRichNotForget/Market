package cn.asghoul.pojo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
/*
 * 商品表：items
 *
 */
public class Items {

    private BigInteger itemId;//商品id
    private Timestamp launchTime;//上架时间
    private String itemName;//商品名称
    private BigDecimal price;//商品价格
    private int itemType;//类型
    private String descr;//描述
    private String epic;//图片
    private BigInteger clientId;//卖家id

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
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

    public String getEpic() {
        return epic;
    }

    public void setEpic(String epic) {
        this.epic = epic;
    }

    public BigInteger getClientId() {
        return clientId;
    }

    public void setClientId(BigInteger clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString(){
        return "Items{"+
                "itemId='"+ itemId+'\''+
                ",launchTime='"+ launchTime+'\''+
                ",itemName='"+ itemName+'\''+
                ",prcie='"+price+'\''+
                "itemType='"+itemType+'\''+
                "descr='"+descr+'\''+
                "epic='"+epic+'\''+
                "clientId='"+clientId+'\''+
                "}";
    }
}
