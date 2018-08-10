package cn.asghoul.dao;

import cn.asghoul.pojo.dto.BoughtSoldItems;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

public interface OrderManageMapper {


    //查询我卖出的商品
    public List<BoughtSoldItems> showSoldItem(@Param("clientId") BigInteger clientId);
    //查看我买入的商品
    public List<BoughtSoldItems> showBoughtItem(@Param("clientId") BigInteger clientId);
}
