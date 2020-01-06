package org.codefarmer.mybatismoredate.service;

import org.codefarmer.mybatismoredate.dao1.UserMapperOne;
import org.codefarmer.mybatismoredate.dao2.BookMapperTwo;
import org.codefarmer.mybatismoredate.pojo.Book;
import org.codefarmer.mybatismoredate.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserAndBookService {
    @Resource
    private UserMapperOne userMapperOne;
    @Resource
    private BookMapperTwo bookMapperTwo;

    public List<User> listUser(){
        List<User> allUser = userMapperOne.getAllUser();
        return allUser;
    }
    public List<Book> listBook(){
        List<Book> allBook = bookMapperTwo.listBook();
        return allBook;
    }
}
