package com.xianyu.mapper;

import com.xianyu.pojo.address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface addressMapper {
    address  selectprioraddress(@Param("clientId")int clientId);
    List<address> selectaddresses(@Param("clientId")int clientId);
    void updateprioraddress(@Param("clientId")int clientId);
    void updateaddress(@Param("name")String name,@Param("telphone")String telphone,@Param("address")String address);
    void deleteaddress(@Param("clientId")int clientId,@Param("addressId")int addressId);
    void insertaddresss(@Param("addressId")int addressId,@Param("address")String address,@Param("telphone")String telphone,@Param("name")String name,@Param("defaultAddress")int defaultAddress,@Param("clientId")int clientId);
}
