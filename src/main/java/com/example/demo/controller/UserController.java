package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
/*    @Autowired
    private UserService userService;
    @RequestMapping("/insert")
    public User testInsert(){
        userService.insertService();
        return userService.selectService("test01");
    }
    @RequestMapping("/select")
    public User testSelect(){
        return userService.selectService("test01");
    }*/
    private Log log = LogFactory.getLog(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/insert")
    public void insetUser(@RequestBody User user){
        userService.insertService(user.getUsername(),user.getPassword());
    }
    @RequestMapping("/select")
    public User selectUser(String username){
        User user = userService.selectService(username);
        log.info(user);
        return user;
    }


}
