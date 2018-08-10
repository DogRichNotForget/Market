package cn.asghoul.pojo.dto;

/*
    展示的买入卖出的商品表

 */
public class BoughtSoldItems {

//
//   商品名称：  itemName
    private String itemName;
//   商品价格：   price
    private  float price;
//   商品图片：   pic
    private String picAddress;


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

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress;
    }
}
