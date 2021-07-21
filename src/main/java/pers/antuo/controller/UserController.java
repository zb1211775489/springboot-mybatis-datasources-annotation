package pers.antuo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.antuo.entity.User;
import pers.antuo.mapper.mapper1.UserMapper1;
import pers.antuo.mapper.mapper2.UserMapper2;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper1 userMapper1;

    @Autowired
    private UserMapper2 userMapper2;

    @RequestMapping("/user1")
    public List<User> query1() {
        return userMapper1.findAll();
    }

    @RequestMapping("/user2")
    public List<User> query2() {
        return userMapper2.findAll();
    }

}
