package cn.asghoul.dao;

import cn.asghoul.pojo.Address;

import java.util.List;
import java.util.Map;

public interface AddressDao {
    List<Address> selectAddress(Map<String,Object> map);
}
