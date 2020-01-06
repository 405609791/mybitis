package org.javaboy.mybatis.service;

import org.javaboy.mybatis.dao.User1Dao;
import org.javaboy.mybatis.dao.UserDao;
import org.javaboy.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private User1Dao user1Dao;
    @Resource
    private UserDao userDao;

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    public List<User> getUsers() {
        return user1Dao.list();
    }
}
