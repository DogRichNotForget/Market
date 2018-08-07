package cn.asghoul.dao;

import cn.asghoul.pojo.Order;

public interface OrderCreateMapper {
    /*
        购买生成订单
     */

    //点击立即购买生成订单
    public void addorder(Order order);
}
