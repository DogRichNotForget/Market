package cn.asghoul.dao;

import cn.asghoul.pojo.Items;

import java.util.List;
import java.util.Map;

public interface ItemsDao {
    List<Items> selectItems(Map<String,Object> map);
}
