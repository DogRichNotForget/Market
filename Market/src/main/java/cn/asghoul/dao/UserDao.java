package cn.asghoul.dao;

import cn.asghoul.pojo.User;
import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> selectUser(Map<String,Object> map);
}