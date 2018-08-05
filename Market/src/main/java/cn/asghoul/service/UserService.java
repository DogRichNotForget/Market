package cn.asghoul.service;

import cn.asghoul.pojo.User;
import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> selectUser(Map<String,Object> map);
}
