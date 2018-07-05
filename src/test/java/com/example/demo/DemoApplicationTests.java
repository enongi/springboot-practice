package com.example.demo;

import com.example.demo.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    private Log log = LogFactory.getLog(DemoApplicationTests.class);
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
    }
    @Test
    public void testUser(){
        userService.insertService("test02","123456");
        log.info(userService.selectService("test01"));
    }

}
