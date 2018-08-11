package cn.asghoul.pojo;

import java.sql.Timestamp;

public class collection {
    int collectId;
    int itemId;
    String itemName;
    int itemType;
    int clientId;
    Timestamp launchTime;
    float price;
    String descr;
    String pic;
    public collection(){}
    public collection(int collectId,int itemId,Timestamp launchTime,String itemName,float price,int itemType,String descr,String pic, int clientId){
        this.itemId=itemId;
        this.launchTime=launchTime;
        this.itemName=itemName;
        this.price=price;
        this.itemType=itemType;
        this.descr=descr;
        this.pic=pic;
        this.clientId=clientId;
        this.collectId=collectId;
    }

    public int getCollectId() {
        return collectId;
    }

    public void setCollectId(int collectId) {
        this.collectId = collectId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Timestamp getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(Timestamp launchTime) {
        this.launchTime = launchTime;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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
}
