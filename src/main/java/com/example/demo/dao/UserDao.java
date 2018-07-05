package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Insert("INSERT INTO tb_user(username,password) VALUES(#{username},#{password})")
    int addUser(@Param("username") String username,@Param("password") String password);

    @Select("SELECT * FROM tb_user WHERE username = #{username}")
    User findUserByName(@Param("username") String username);
}
