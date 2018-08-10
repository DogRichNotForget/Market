package cn.asghoul.service.impl;

import cn.asghoul.pojo.dto.OrderDetails;
import cn.asghoul.pojo.dto.OrderPay;
import cn.asghoul.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
@Service
@Transactional
public class OrderServiceImpl implements OrderService
{

    @Override
    public void createOrder(OrderDetails orderDetails) {

    }

    @Override
    public OrderPay showPayDetail(BigInteger orderId) {
        return null;
    }
}
