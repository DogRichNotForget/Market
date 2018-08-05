package com.service;

import com.pojo.User;

import java.util.List;

public interface UserService {

    public User selectUser(long userId);

    public List<User> selectAllUser();

    public User selectUserByEmail(String email);

    public User addUser(User user);

    public User removeUser(long userId);

    public User modifyUser(User user);

}
