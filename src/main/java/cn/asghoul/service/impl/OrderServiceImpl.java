package cn.asghoul.service.impl;

import cn.asghoul.dao.AddressMapper;
import cn.asghoul.dao.CollectMapper;
import cn.asghoul.dao.OrderManageMapper;
import cn.asghoul.dao.OrderMapper;
import cn.asghoul.pojo.Address;
import cn.asghoul.pojo.Order;
import cn.asghoul.pojo.dto.OrderDetails;
import cn.asghoul.pojo.dto.OrderPayItems;
import cn.asghoul.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



@Service
@Transactional
public class OrderServiceImpl implements OrderService
{
    @Autowired
    AddressMapper addressMapper;
    @Autowired
    OrderManageMapper orderManageMapper;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    CollectMapper collectMapper;
    /**
     * 点击提交订单，创建订单
     * 1.计算总价
     * 2.写入订单表和订单商品表
     * 3.从购物车移除
     */
    @Override
    public OrderDetails createOrder(OrderDetails orderDetails) {

        float totalMoney=0;


        Order order=new Order();
        order.setAddressId(orderDetails.getAddressId());
        order.setClientId(orderDetails.getClientId());
        order.setMoney(totalMoney);
        order.setPatState(0);//(0是未支付，1是已支付)
        //存入订单表
        orderMapper.addorder(order);


        List<BigInteger> itemsId=orderDetails.getItemsId();
        Iterator<BigInteger> it=itemsId.iterator();
        while(it.hasNext())
        {
            //存入订单商品表
            orderMapper.addOrderItem(orderDetails.getOrderId(),it.next());
            //从购物车中删除
            BigInteger collectId=orderMapper.returnCollectId(it.next());
            collectMapper.deletecollect(collectId);
        }



        return null;
    }

    /**
         * 确认订单页面订单详情展示
         * 取收货地址，取默认的地址或者第一条非默认地址
         * 取商品的详细信息（图片，名称，单价等）
         * 总价
         */
     @Override
    public Map<String, Object> showPayDetail(BigInteger orderId) {
         Map<String, Object> map = new HashMap<String, Object>();
         float totalMoney = 0;
         BigInteger clientId = orderMapper.getClientId(orderId);
         //获取地址
         Address defaultAddress = addressMapper.selectprioraddress(clientId);
         if (null == defaultAddress) {
             List<Address> list = addressMapper.selectaddresses(clientId);
             Iterator<Address> it = list.iterator();
             if (it.hasNext())
                 defaultAddress = it.next();
         }
         //获取所有订单商品
         List<OrderPayItems> items = orderMapper.allItems(orderId);
         Iterator<OrderPayItems> its=items.iterator();
         while(its.hasNext())
         {
             //计算订单总金额
             totalMoney+= its.next().getPrice();
         }

        map.put("address",defaultAddress);
        map.put("items",items);
        map.put("totalMoney",totalMoney);
        return map;
    }
}
