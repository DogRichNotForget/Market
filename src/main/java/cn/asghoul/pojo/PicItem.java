package cn.asghoul.pojo;

import java.math.BigInteger;

    /*
     *  商品图片表:picItem
     */
    public class PicItem {
        private BigInteger picId;//图片id
        private BigInteger itemId;//商品id
        private String picAddress;//图片地址

    public BigInteger getPicId() {
        return picId;
    }

    public void setPicId(BigInteger picId) {
        this.picId = picId;
    }

    public BigInteger getItemId() {
        return itemId;
    }

    public void setItemId(BigInteger itemId) {
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
