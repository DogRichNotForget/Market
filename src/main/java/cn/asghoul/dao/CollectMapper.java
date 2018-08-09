package cn.asghoul.dao;

import cn.asghoul.pojo.Collect;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

public interface CollectMapper {
    //根据商品Id加入购物车
    void insertCollect(@Param("coolectId") int collectId,
                        @Param("clientId") int clientId,
                        @Param("itemId") int itemId,
                        @Param("itemName") String itemName,
                        @Param("itemType") int itemType);
}
