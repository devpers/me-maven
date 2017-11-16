package com.me.maven.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.me.maven.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> findUserByUserName(@Param("name")String name);
}