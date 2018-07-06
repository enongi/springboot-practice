package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

/*    public void insertService(){
        userDao.addUser("test01","123456");
    }
    public User selectService(String username){
        return userDao.findUserByName(username);
    }*/

    public void insertService(String username,String password){
        userDao.addUser(username,password);
    }
    public User selectService(String username){
        return userDao.findUserByName(username);
    }
    public void updateService(String username,String password,int id){
        userDao.updateUser(username,password,id);
    }
    public void deleteService(String username){
        userDao.deleteUser(username);
    }
}
