package com.xianyu.mapper;

import com.xianyu.pojo.collect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface collectMapper {
    List<collect> selectcollect(@Param("clientId")int clientId);
    void deletecollect(@Param("clientId")int clientId,@Param("collectId")int collectId);
}
