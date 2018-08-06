package cn.asghoul.dao;

import cn.asghoul.pojo.Items;
import cn.asghoul.pojo.Picitem;

import java.util.List;



public interface ItemsDao {
    //根据商品Id查询商品信息
    List<Items> selectItems(int itemsId);
    //根据商品Id查询商品图片
    List<Picitem> selectPic(int itemsId);
}
