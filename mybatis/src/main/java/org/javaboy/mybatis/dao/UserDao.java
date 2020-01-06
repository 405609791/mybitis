package org.javaboy.mybatis.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.javaboy.mybatis.pojo.User;

import java.util.List;

public interface UserDao {
    @Select("select * from user")
    List<User> getAllUsers();


}
