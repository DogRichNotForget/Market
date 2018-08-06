package cn.asghoul.service.impl;

import cn.asghoul.dao.ItemsDao;
import cn.asghoul.pojo.Items;
import cn.asghoul.service.ItemsService;
import com.alibaba.druid.util.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class ItemsServiceImpl implements ItemsService{
   //查询商品信息
    @Autowired
    ItemsDao ItemsDao;

    @Override
    public List<Items> selectItems(Map<String ,Object> map){
        return ItemsDao.selectItems(map);
    }
}
