package cn.asghoul.dao;

import cn.asghoul.pojo.Items;
import cn.asghoul.pojo.PicItem;


import java.util.List;
import java.util.Map;


public interface ItemsDao {
    //根据商品Id查询商品信息
    List<Items> selectItems(long itemId);
    //根据图片Id查询商品图片
    List<PicItem> selectPic(long picId);
}
