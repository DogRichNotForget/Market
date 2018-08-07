package cn.asghoul.service;

import cn.asghoul.pojo.Address;

import java.util.List;
import java.util.Map;

public interface AddressService {
    List<Address> selectAddress( long addressId);
}
