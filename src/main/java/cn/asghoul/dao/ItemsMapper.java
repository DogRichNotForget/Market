package cn.asghoul.dao;

import cn.asghoul.pojo.Client;
import cn.asghoul.pojo.Items;
import cn.asghoul.pojo.PicItem;
import org.apache.ibatis.annotations.Param;


import java.util.List;



public interface ItemsMapper {
    //根据商品Id查询商品信息
    List<Items> selectItems(@Param("itemId") int itemId);
    //根据商品Id查询图片信息
    List<PicItem> selectPicItem(@Param("itemId")int itemId);
    //根据用户Id查询收货人信息
    List<Client> selectClient(@Param("itemId") int itemId);
}
