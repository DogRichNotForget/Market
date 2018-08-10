package cn.asghoul.dao;

import cn.asghoul.pojo.dto.OrderManageItem;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

/*
       订单的各种状态
 */
public interface OrderStatusMapper
{
    //查看待收货的商品
    public List<OrderManageItem> showToBeReceivedItem(@Param("orderId")BigInteger orderId);
    //产看待评论的商品
    public List<OrderManageItem> showToBeCommentItem(@Param("orderId")BigInteger orderId);
    //产看为付款的商品
    public List<OrderManageItem> showToPayItem(@Param("orderId")BigInteger orderId);

    //修改评论状态为待评价
    public void updadteToBeComment(@Param("orderId") BigInteger orderId);
    //修改评论状态为已评价
    public void updadteCommented();
    //修改物流状态为待收货
    public void updateToBeReceived();
    //修改物流状态为已收货
    public void updateReceived();
}
