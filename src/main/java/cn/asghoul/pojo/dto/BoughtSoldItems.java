package cn.asghoul.pojo.dto;

import java.sql.Timestamp;

/*
    买入的商品表

 */
public class BoughtSoldItems {

//
//   商品名称：  itemName
    private String itemName;
//   商品价格：   price
    private  float price;
//   商品图片：   pic
    private String pic;
//   交易时间：   endTime
    private Timestamp endTime;

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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }
}
