package com.xianyu.pojo;

public class collect {
    int collectId;
    int itemId;
    String itemName;
    int itemType;
    int clientId;

    public collect(){}
    public collect(int collectId,int itemId,String itemName,int itemType,int clientId){
        this.collectId=collectId;
        this.itemId=itemId;
        this.itemName=itemName;
        this.itemType=itemType;
        this.clientId=clientId;
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

    @Override
    public String toString(){
        return "collect [collectId=" + collectId + ", itemId=" + itemId + ", itemName=" + itemName + ", itemType=" + itemType + ", clientId=" + clientId + "]";
    }
}
