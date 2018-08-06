package cn.asghoul.service;

import cn.asghoul.pojo.Items;

import java.util.List;
import java.util.Map;

public interface ItemsService {
    List<Items> selectItems(Map<String,Object> map);
}
