package cn.asghoul.pojo;
/*
 *  商品图片表:picitem
 */
public class Picitem {
    private long picId;//图片id
    private long itemId;//商品id
    private String picAddress;//图片地址

    public long getPicId() {
        return picId;
    }

    public void setPicId(long picId) {
        this.picId = picId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress;
    }

    @Override
    public String toString() {
        return "Picitem{" +
                "picId='" + picId + '\'' +
                ",itemId='" + itemId + '\'' +
                ",picAddress='" + picAddress+ '\'' +
                "}";
    }
}
