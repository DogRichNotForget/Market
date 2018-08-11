package cn.asghoul.dao;

import cn.asghoul.pojo.Address;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

public interface AddressMapper {
    Address  selectprioraddress(@Param("clientId")BigInteger clientId);
    List<Address> selectaddresses(@Param("clientId")BigInteger clientId);
    void updateDefault(@Param("addressId")BigInteger addressId);
    void updateNormal(@Param("addressId")BigInteger addressId);
    void updateaddress(@Param("name")String name,@Param("telphone")String telphone,@Param("Address")String address,@Param("clientId")BigInteger clientId,@Param("addressId")BigInteger addressId);
    void deleteaddress(@Param("addressId")BigInteger addressId);
    void insertaddress(@Param("Address")String address,@Param("telphone")String telphone,@Param("name")String name,@Param("defaultAddress")BigInteger defaultAddress,@Param("clientId")BigInteger clientId);
}