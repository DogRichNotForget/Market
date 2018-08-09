package cn.asghoul.service;

import cn.asghoul.pojo.Client;
import cn.asghoul.pojo.Items;
import cn.asghoul.pojo.PicItem;

import java.util.List;
import java.util.Map;

public interface ItemsService {
    //得到商品全部信息
    List<Items> getselectItems(int itemId);
    //得到图片全部信息
    List<PicItem> getselectPicItem(int itemId);
    //得到卖家电话
    List<Client> getselectClient(int itemId);
}
