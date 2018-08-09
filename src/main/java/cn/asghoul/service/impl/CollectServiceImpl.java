package cn.asghoul.service.impl;

import cn.asghoul.dao.CollectMapper;
import cn.asghoul.pojo.Collect;
import cn.asghoul.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CollectServiceImpl implements CollectService {
    //加入购物车
    @Autowired
   private CollectMapper collectMapper;
    @Override
    public void getinsertCollect(int collectId,int clientId, int itemType, int itemId, String itemName){
         collectMapper.insertCollect(collectId,clientId,itemId,itemName,itemType);
    }


}
