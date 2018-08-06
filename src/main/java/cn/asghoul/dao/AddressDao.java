package cn.asghoul.dao;

import cn.asghoul.pojo.Address;

import java.util.List;
import java.util.Map;

public interface AddressDao {
    //根据地址Id查询收货人信息
    List<Address> selectAddress(int itemsId);
}
