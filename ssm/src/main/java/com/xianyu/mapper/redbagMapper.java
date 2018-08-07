package com.xianyu.mapper;

import com.xianyu.pojo.redbag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface redbagMapper {
    List<redbag> selectspecialredbag(@Param("clientId")int clientId);
    List<redbag> selectgeneralredbag(@Param("clientId")int clientId);
    List<redbag> nowdayredbag(@Param("clientId")int clientId);
}
