package cn.asghoul.service.impl;

import cn.asghoul.dao.AddressDao;
import cn.asghoul.pojo.Address;
import cn.asghoul.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AddressServiceImpl implements AddressService {
    //查询收货人信息
    @Autowired
    AddressDao addressDao;
    @Override
    public List<Address> selectAddress(long addressId){
        return addressDao.selectAddress(addressId);
    }
}
