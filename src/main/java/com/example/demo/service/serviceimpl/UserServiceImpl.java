package com.example.demo.service.serviceimpl;

import com.example.demo.mappers.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.selectAll();
    }

    public User getOne(String id){
        return userMapper.select(id);
    }

    @Override
    public int remove(String id) {
        return userMapper.delete(id);
    }

    @Override
    public int add(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int modify(User user) {
        return userMapper.update(user);
    }

    @Transactional
    @Override
    public void saveAll(List<User> list) {
        for (User user: list){
            userMapper.insert(user);
        }
    }
}
