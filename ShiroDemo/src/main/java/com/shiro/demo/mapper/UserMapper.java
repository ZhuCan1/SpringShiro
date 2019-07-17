package com.shiro.demo.mapper;

import com.shiro.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {

    User findByUsername(@Param("username")String username);
}
