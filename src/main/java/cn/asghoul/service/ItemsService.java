package cn.asghoul.service;

import cn.asghoul.pojo.Items;
import cn.asghoul.pojo.PicItem;

import java.util.List;
import java.util.Map;

public interface ItemsService {
    //得到商品全部信息
    List<Items> selectItems(long itemsId);
    //得到商品图片
    List<PicItem> selectPic(long picId);
}
