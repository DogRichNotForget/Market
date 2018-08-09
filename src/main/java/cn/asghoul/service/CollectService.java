package cn.asghoul.service;

import cn.asghoul.pojo.Collect;

import java.math.BigInteger;
import java.util.List;

public interface CollectService {
    //加入购物车

    void getinsertCollect( int collectId,int clientId, int itemType, int itemId, String itemName);

}
