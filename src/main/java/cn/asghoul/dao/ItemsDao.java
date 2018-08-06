package cn.asghoul.dao;

import cn.asghoul.pojo.Items;
import cn.asghoul.pojo.Picitem;

import java.util.List;
import java.util.Map;


public interface ItemsDao {
    //根据商品Id查询商品信息
    List<Items> selectItems(Map<String, Object> itemsId);
    //根据商品Id查询商品图片
    List<Picitem> selectPic(Map<String, Object> itemsId);
}
