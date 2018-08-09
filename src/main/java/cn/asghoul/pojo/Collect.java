package cn.asghoul.pojo;

import java.math.BigInteger;

public class Collect {
    private int collectId;//收藏id
    private int clientId;//用户id
    private int itemId;//商品id
    private String itemName;//商品名称
    private int itemType;//商品类型

    public int getCollectId() {
        return collectId;
    }

    public void setCollectId(int collectId) {
        this.collectId = collectId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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
    @Override
    public String toString() {
        return "Collect{" +
                "collectId='" + collectId + '\'' +
                ",clientId='" + clientId + '\'' +
                ",itemId='" + itemId+ '\'' +
                ",itemName='"+itemId+'\''+
                ",itemType='"+itemType+'\''+
                "}";
    }
}
