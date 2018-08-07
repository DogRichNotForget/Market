package com.xianyu.service.imp;

import com.xianyu.mapper.clientMapper;
import com.xianyu.pojo.client;
import com.xianyu.service.clientService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class clientServiceImpl implements clientService {

    private clientMapper clientmapper;
    @Override
    public client selectOneclient() {
        return null;
    }

    @Override
    public void updateemail() {

    }

    @Override
    public void updatepassword() {

    }

    @Override
    public void updatetelphone() {

    }

    @Override
    public void updatepic() {

    }

    @Override
    public void updatesex() {

    }

    @Override
    public void updateprsign() {

    }

    @Override
    public void updatename() {

    }

    @Override
    public void updateold() {

    }

}
