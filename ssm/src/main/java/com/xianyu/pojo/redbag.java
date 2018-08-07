package com.xianyu.pojo;

import java.sql.Timestamp;

public class redbag {
    int bagId;
    Timestamp createTime;
    Timestamp endTime;
    int bagState;
    public redbag(){}
    public redbag(int bagId,  Timestamp createTime, Timestamp endTime, int bagState){
        this.bagId=bagId;
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
