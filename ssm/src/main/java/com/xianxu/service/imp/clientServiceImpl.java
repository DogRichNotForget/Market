package com.xianxu.service.imp;

import com.xianxu.pojo.client;
import com.xianxu.service.clientService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class clientServiceImpl implements clientService {

    private ClientMapper clientmapper;
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
