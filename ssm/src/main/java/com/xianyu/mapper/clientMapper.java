package com.xianyu.mapper;

import com.xianyu.pojo.client;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface clientMapper {
    List<client> selectMessage(@Param("clientId")int clientId);
    void updatepic(@Param("clientId")int clientId,@Param("pic")String pic);
    void updadteMessage(@Param("name")String name,@Param("sex")char sex,@Param("prsign")String prsign,@Param("telphone")String telphone,@Param("email")String email,@Param("clientId")int clientId);
    List<client> selectMessages(@Param("clientId")int clientId);
}
