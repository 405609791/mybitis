package org.javaboy.mybatis.controller;

import org.javaboy.mybatis.dao.UserDao;
import org.javaboy.mybatis.pojo.User;
import org.javaboy.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/user")
    public List<User> getAllUser(){
        List<User> list = userService.getAllUsers();
        return list;
    }
    @RequestMapping("/list")
    public List<User> getUserList(){
        List<User> list = userService.getUsers();
        return list;
    }
}
