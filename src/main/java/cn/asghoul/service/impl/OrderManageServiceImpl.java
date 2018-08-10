package cn.asghoul.service.impl;

import cn.asghoul.dao.OrderManageMapper;
import cn.asghoul.dao.OrderMapper;
import cn.asghoul.pojo.dto.BoughtSoldItems;
import cn.asghoul.pojo.dto.OrderManageItem;
import cn.asghoul.service.OrderManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;
@Service
@Transactional
public class OrderManageServiceImpl implements OrderManageService {

    @Autowired
    private OrderManageMapper orderManageMapper;
    @Autowired
    private OrderMapper orderMapper;



    //查询我买入的商品
    @Override
    public List<BoughtSoldItems> boughtItems(BigInteger clientId)
    {
        return orderManageMapper.showBoughtItem(clientId);
    }

    //查看我卖出的商品
    @Override
    public List<BoughtSoldItems> soldItems(BigInteger clientId)
    {
        return orderManageMapper.showSoldItem(clientId);
    }

    //查看待收货的商品
    @Override
    public List<OrderManageItem> showToBeReceivedItem(BigInteger orderId)
    {
        return  orderManageMapper.showToBeReceivedItem(orderId);
    }

    //产看待评价的商品
    @Override
    public List<OrderManageItem> showToBeCommentItem(BigInteger orderId)
    {
        return orderManageMapper.showToBeCommentItem(orderId);
    }

    //查看待支付的商品
    @Override
    public List<OrderManageItem> showToPayItem(BigInteger orderId)
    {
        return orderManageMapper.showToPayItem(orderId);
    }

    //确认收货
    @Override
    public void confirmOrder(BigInteger itemId) {
        orderManageMapper.updateReceived(itemId);

        //
    }

    //提交评价
    @Override
    public void submitComment(BigInteger itemId) {
        orderManageMapper.updateCommented(itemId);
    }

    //支付订单
    @Override
    public void payOrder(BigInteger orderId) {
        //付款后，payState为已支付,expressState为待收货,
        orderManageMapper.updatePrepaid(orderId);

    }

    //取消订单
    @Override
    public void cancelOrder(BigInteger orderId) {
        orderMapper.deleteOrderItem(orderId);
        orderMapper.delorder(orderId);
    }

   //删除我卖出的商品信息
   @Override
    public void deleteSoldItem(BigInteger clientId, BigInteger itemId) {
        orderManageMapper.deleteSoldItem(clientId,itemId);
    }

   //删除我买入的商品信息
   @Override
    public void deleteBoghtItem(BigInteger clientId, BigInteger itemId) {
       orderManageMapper.deleteBoghtItem(clientId,itemId);
    }

}
