package cn.asghoul.pojo;

import java.math.BigInteger;

    /*
     *  商品图片表:picItem
     */
    public class PicItem {
        private int picId;//图片id
        private int itemId;//商品id
        private String picAddress;//图片地址

    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
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
            return "PicItem{" +
                    "picId='" + picId + '\'' +
                    ",itemId='" + itemId + '\'' +
                    ",picAddress='" + picAddress+ '\'' +
                    "}";
        }


}
