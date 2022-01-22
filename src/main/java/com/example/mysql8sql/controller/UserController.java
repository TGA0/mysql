package com.example.mysql8sql.controller;

import com.example.mysql8sql.pojo.User;
import com.example.mysql8sql.service.UserService;
import com.example.mysql8sql.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/login")
    public User login(String username,String password){
        return userService.login(username,password);
    }

    @GetMapping("/all")
    public List<User> getUsers(String order){
        return userService.getUsers(order);
    }
}
