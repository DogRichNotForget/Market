package cn.asghoul.dao;

import cn.asghoul.pojo.items;

public interface itemsDao {
    public items getItemsBytype(int itemType);

    public items getItemsByname();


}
