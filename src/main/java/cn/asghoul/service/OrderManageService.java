package cn.asghoul.service;

import cn.asghoul.pojo.dto.BoughtSoldItems;
import cn.asghoul.pojo.dto.OrderManageItem;

import java.math.BigInteger;
import java.util.List;

public interface OrderManageService {

    //查询我买入的商品
    public List<BoughtSoldItems> boughtItems(BigInteger clientId);
    //查询我卖出的商品
    public List<BoughtSoldItems> soldItems(BigInteger clientId);
    //查询待收货的商品
    public List<OrderManageItem> showToBeReceivedItem(BigInteger orderId);
    //查询待评价的商品
    public List<OrderManageItem> showToBeCommentItem(BigInteger orderId);
    //查询待付款的商品
    public List<OrderManageItem> showToPayItem(BigInteger orderId);


    //确认收货
    public void confirmOrder(BigInteger itemId);
    //提交评价
    public void submitComment(BigInteger itemId);
    //支付订单
    public void payOrder(BigInteger orderId);
    //取消订单
    public void cancelOrder(BigInteger orderId);
    //删除我卖出的商品信息
    public void deleteSoldItem(BigInteger clientId,BigInteger itemId);
    //删除我买入的商品信息
    public void deleteBoghtItem(BigInteger clientId,BigInteger itemId);



}
