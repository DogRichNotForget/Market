package cn.asghoul.pojo.dto;

/*
    待收货、待付款、待评价的商品

 */
public class OrderManageItem {
//    用户昵称：name,
    private String name;
//    商品名称：itemName,
    private String itemName;
//    商品描述：descr,
    private String descr;
//    商品价格：price,
    private float price;
//    商品图片：pic
    private String picAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
