package cn.asghoul.service.impl;

import cn.asghoul.dao.ItemsDao;
import cn.asghoul.pojo.Items;
import cn.asghoul.pojo.PicItem;
import cn.asghoul.service.ItemsService;
import com.alibaba.druid.util.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;


@Service
public class ItemsServiceImpl implements ItemsService{

    @Autowired
    ItemsDao itemsDao;
    //得到商品全部信息
    @Override
    public List<Items> selectItems(long itemId){
        return itemsDao.selectItems(itemId);
    }
    //得到商品全部图片
    @Override
    public List<PicItem> selectPic(long picId){return itemsDao.selectPic(picId); }
}
