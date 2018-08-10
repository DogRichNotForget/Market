package cn.asghoul.dao;

import cn.asghoul.pojo.Order;
import cn.asghoul.pojo.dto.OrderPay;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;

public interface OrderMapper {
    /*
        购买生成订单
     */

    //点击立即购买/结算生成订单
    public void addorder(Order order);
    //查询订单
    public OrderPay selectOrders(@Param("clientId") BigInteger clientId);

    //删除订单
    public void delorder(@Param("orderId")BigInteger orderId);

}
