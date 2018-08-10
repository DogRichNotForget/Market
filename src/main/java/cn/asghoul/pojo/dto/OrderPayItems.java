package cn.asghoul.pojo.dto;

public class OrderPayItems {

//    商品名称：itemName,
    private String itemName;
//    商品描述：descr,
    private String descr;
//    商品价格：price,
    private float price;
//    商品图片地址：picAddress
    private String picAddress;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
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
