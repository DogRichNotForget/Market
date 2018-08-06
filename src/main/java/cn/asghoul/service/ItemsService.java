package cn.asghoul.service;

import cn.asghoul.pojo.Items;
import cn.asghoul.pojo.Picitem;

import java.util.List;
import java.util.Map;

public interface ItemsService {
    //得到商品全部信息
    List<Items> selectItems(int itemsId);
    //得到商品图片
    List<Picitem> selectPic(int itemsId);
}
