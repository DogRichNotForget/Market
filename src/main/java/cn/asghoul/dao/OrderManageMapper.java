package cn.asghoul.dao;

import cn.asghoul.pojo.dto.BoughtSoldItems;
import cn.asghoul.pojo.dto.OrderManageItem;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

/*
       订单的各种状态
 */
public interface OrderManageMapper
{

    //查询我卖出的商品
    public List<BoughtSoldItems> showSoldItem(@Param("clientId") BigInteger clientId);
    //查看我买入的商品
    public List<BoughtSoldItems> showBoughtItem(@Param("clientId") BigInteger clientId);
    //查看待收货的商品
    public List<OrderManageItem> showToBeReceivedItem(@Param("orderId")BigInteger orderId);
    //产看待评论的商品
    public List<OrderManageItem> showToBeCommentItem(@Param("orderId")BigInteger orderId);
    //产看为付款的商品
    public List<OrderManageItem> showToPayItem(@Param("orderId")BigInteger orderId);

    //修改评论状态为待评价
    public void updateToBeComment(@Param("orderId") BigInteger orderId);
    //修改评论状态为已评价
    public void updateCommented(@Param("itemId") BigInteger itemId);
    //修改物流状态为待收货
    public void updateToBeReceived(@Param("itemId") BigInteger itemId);
    //修改物流状态为已收货
    public void updateReceived(@Param("itemId") BigInteger itemId);
    //修改支付状态为已支付
    public void updatePrepaid(@Param("orderId") BigInteger orderId);
    //删除我买入的商品
    public void deleteBoghtItem(@Param("clientId") BigInteger clientId,@Param("itemId") BigInteger itemId);
    //删除我卖出的商品
    public void deleteSoldItem(@Param("clientId") BigInteger clientId,@Param("itemId") BigInteger itemId);
    //根据订单Id查询商品Id
    public List<BigInteger> selectById(@Param("orderId") BigInteger orderId);

    //存入我卖出的商品表
    public void addSoldItem(@Param("clientId")BigInteger clientId, @Param("itemId")BigInteger itemId);
    //存入我买入的商品表
    public void addBoughtItem(@Param("clientId")BigInteger clientId, @Param("itemId")BigInteger itemId);
    //根据商品Id返回卖家Id
    public BigInteger returnSoldId(@Param("itemId") BigInteger itemId);
    //根据商品Id返回买家Id
    public BigInteger returnBoughtId(@Param("itemId") BigInteger itemId);
}
