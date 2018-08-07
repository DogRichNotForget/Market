package com.dao;

import com.pojo.User;

import java.util.List;

public interface UserDao {

    User selectUser(long id);

    List<User> selectAllUser();

    User selectUserByEmail(String email);

    User addUser(User user);

    User removeUser(long id);

    User modifyUser(User user);

}