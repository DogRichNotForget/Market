package cn.asghoul.service;

import cn.asghoul.pojo.dto.OrderDetails;

import java.math.BigInteger;
import java.util.Map;

public interface OrderService {

    //生成新订单
    public OrderDetails createOrder(OrderDetails orderDetails);

    //查询订单详情
    public Map<String,Object> showPayDetail(BigInteger orderId);
}
