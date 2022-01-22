package com.example.mysql8sql.service;

import com.example.mysql8sql.pojo.User;

import java.util.List;

public interface UserService {
    User login(String username,String password);
    List<User> getUsers(String order);
}
