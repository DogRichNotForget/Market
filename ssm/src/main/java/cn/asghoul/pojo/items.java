package cn.asghoul.pojo;

import java.math.BigInteger;
import java.sql.Timestamp;

public class items {
    private BigInteger itemId;
    private Timestamp  launchTime;
    private String itemName;
    private float price;
    private int itemType;
    private String desc;
    private String pic;
    private BigInteger clientId;

    public BigInteger getItmeId() {
        return itemId;
    }

    public void setItmeId(BigInteger itmeId) {
        this.itemId = itmeId;
    }

    public Timestamp getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(Timestamp launchTime) {
        this.launchTime = launchTime;
    }

    public String getItmeName() {
        return itemName;
    }

    public void setItmeName(String itmeName) {
        this.itemName = itmeName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getIntemType() {
        return itemType;
    }

    public void setIntemType(int intemType) {
        this.itemType = intemType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public BigInteger getClientId() {
        return clientId;
    }

    public void setClientId(BigInteger clientId) {
        this.clientId = clientId;
    }
}
