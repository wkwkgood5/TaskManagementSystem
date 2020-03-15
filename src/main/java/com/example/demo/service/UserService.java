package com.example.demo.service;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService{
    public List<User> selectUserByName();

    int deleteById(@Param("id") String id);

    int add(User user);

    int update(User user);

    public void saveAll(List<User> list);
}
