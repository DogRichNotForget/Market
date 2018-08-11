package cn.asghoul.dao;

import cn.asghoul.pojo.collection;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

public interface CollectMapper {
    List<collection> selectcollect(@Param("clientId")BigInteger clientId);
    void deletecollect(@Param("collectId")BigInteger collectId);
//    void insertcollect(@Param("collectId")int collectId,@Param("itemId")int itemId,@Param("itemName")String itemName,@Param("itemType")int itemType,@Param("clientId")int clientId);
}
