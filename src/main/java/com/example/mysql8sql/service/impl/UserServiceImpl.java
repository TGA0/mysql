package com.example.mysql8sql.service.impl;

import com.example.mysql8sql.mapper.UserMapper;
import com.example.mysql8sql.pojo.User;
import com.example.mysql8sql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.login(username,password);
    }

    @Override
    public List<User> getUsers(String order) {
        return userMapper.getUsers(order);
    }
}
