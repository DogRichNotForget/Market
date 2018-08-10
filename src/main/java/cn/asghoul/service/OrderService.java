package cn.asghoul.service;

import cn.asghoul.pojo.dto.OrderDetails;
import cn.asghoul.pojo.dto.OrderPay;

import java.math.BigInteger;

public interface OrderService {

    //生成新订单
    public void createOrder(OrderDetails orderDetails);

    //查询订单详情
    public OrderPay showPayDetail(BigInteger orderId);
}
