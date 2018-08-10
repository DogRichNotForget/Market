package cn.asghoul.dao;

import cn.asghoul.pojo.Address;
import cn.asghoul.pojo.dto.OrderPay;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

/*
    地址表的增删改查
 */
public interface AddressMapper
{
    //修改地址
    public void updateAddress(@Param("address") String address,
                              @Param("telphone") String telphone,
                              @Param("name") String name);
    //添加新地址
    public void addAddress(@Param("clientId") BigInteger clientId,
                           @Param("address") String address,
                           @Param("telphone") String telphone,
                           @Param("name") String name);
    //查询地址的id
    public int returnId(Address address);
    //    //将该地址设置为默认地址
    public void updateDefault(@Param("addressId") BigInteger addressId);
    //将该地址设置为普通地址
    public void updateNormal(@Param("addressId") BigInteger addressId);
    //根据订单id查询地址
    public Address selectById(@Param("orderId") BigInteger orderId);
    //查询所有地址
    List<Address> selectAddress(@Param("clientId") int clientId);


    //查询默认地址
    public OrderPay selectDefault();
    //查询第一条地址
    public OrderPay selectFirst();
    //删除地址
    public void delAddress(@Param("addressId") BigInteger addressId);

    //三级联动地址查询

    //查询所有省
    public List<String> province();
    //查询所有市
    public List<String> city(@Param("id") int id);
    //查询所有区
    public List<String> district(@Param("id") int id);

    //根据省、市名称查询id
    public int returnId(@Param("name") String name);

}
