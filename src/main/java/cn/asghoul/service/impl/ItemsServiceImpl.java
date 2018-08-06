package cn.asghoul.service.impl;

import cn.asghoul.dao.ItemsDao;
import cn.asghoul.pojo.Items;
import cn.asghoul.pojo.Picitem;
import cn.asghoul.service.ItemsService;
import com.alibaba.druid.util.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ItemsServiceImpl implements ItemsService{

    @Autowired
    ItemsDao ItemsDao;

    @Override
    public List<Items> selectItems(int itemsId){
        return ItemsDao.selectItems(itemsId);
    }

    @Override
    public List<Picitem> selectPic(int itemsId){return ItemsDao.selectPic(itemsId); }
}
