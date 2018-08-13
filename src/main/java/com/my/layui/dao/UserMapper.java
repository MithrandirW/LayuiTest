package com.my.layui.dao;

import com.my.layui.model.User;


import java.util.List;

import org.springframework.stereotype.Repository;

public interface UserMapper{
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}