package cn.asghoul.service.impl;

import cn.asghoul.dao.CollectMapper;
import cn.asghoul.dao.ItemsMapper;
import cn.asghoul.pojo.Client;
import cn.asghoul.pojo.Items;
import cn.asghoul.pojo.PicItem;
import cn.asghoul.service.ItemsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService{

    @Autowired
     private ItemsMapper itemsMapper;

    //得到商品全部信息
    @Override
    public List<Items> getselectItems(int itemId){
        return itemsMapper.selectItems(itemId);
    }
    //得到图片全部信息
    @Override
    public List<PicItem> getselectPicItem(int itemId){
        return itemsMapper.selectPicItem(itemId);
    }

    //查询收货人信息
    @Override
    public List<Client> getselectClient(int itemId) {
        return itemsMapper.selectClient(itemId);
    }
}
