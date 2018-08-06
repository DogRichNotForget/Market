package com.xianxu.pojo;

import java.sql.Timestamp;

public class redbags {
    int bagId;
    int clientId;
    float money;
    int bagType;
    Timestamp createTime;
    Timestamp endTime;
    int bagState;
    public redbags(){}
    public redbags(int bagId, int clientId, float money, int bagType, Timestamp createTime, Timestamp endTime, int bagState){
        this.bagId=bagId;
        this.clientId=clientId;
        this.money=money;
        this.bagType=bagType;
        this.createTime=createTime;
        this.endTime=endTime;
        this.bagState=bagState;
    }

    public int getBagId() {
        return bagId;
    }

    public void setBagId(int bagId) {
        this.bagId = bagId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public int getBagType() {
        return bagType;
    }

    public void setBagType(int bagType) {
        this.bagType = bagType;
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

    public int getBagState() {
        return bagState;
    }

    public void setBagState(int bagState) {
        this.bagState = bagState;
    }
}
