package org.codefarmer.mybatismoredate.controller;

import org.codefarmer.mybatismoredate.dao1.UserMapperOne;
import org.codefarmer.mybatismoredate.dao2.BookMapperTwo;
import org.codefarmer.mybatismoredate.pojo.Book;
import org.codefarmer.mybatismoredate.pojo.User;
import org.codefarmer.mybatismoredate.service.UserAndBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MybatisMoreDateController {
    @Autowired
    UserAndBookService userAndBookService;

    @RequestMapping("/listUser")
    public List<User> listUser(){
        List<User> allUser = userAndBookService.listUser();
        return allUser;
    }
    @RequestMapping("/listBook")
    public List<Book> listBook(){
        List<Book> allBook = userAndBookService.listBook();
        return allBook;
    }
}
