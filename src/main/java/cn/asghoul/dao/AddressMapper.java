package cn.asghoul.dao;

import cn.asghoul.pojo.Address;
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
    //查询地址的类型
    public int returnId(@Param("addressId") BigInteger addressId);
    //    //将该地址设置为默认地址
    public void updateDefault(Address address);
    //将该地址设置为普通地址
    public void updateNormal(Address address);
    //根据id查询地址
//    public Address
    //查询所有地址
    List<Address> selectAddress(int addressId);
    //删除地址
    public void delAddress(int Address);


}
