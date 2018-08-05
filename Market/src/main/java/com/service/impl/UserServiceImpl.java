package com.service.impl;

import com.pojo.User;
import com.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

    public List<User> selectAllUser() {
        return this.userDao.selectAllUser();
    }

    public User selectUserByEmail(String email) {
        return this.userDao.selectUserByEmail(email);
    }

    public User addUser(User user) {
        return this.userDao.addUser(user);
    }

    public User removeUser(long userId) {
        return this.userDao.removeUser(userId);
    }

    public User modifyUser(User user) {
        return this.userDao.modifyUser(user);
    }

}
