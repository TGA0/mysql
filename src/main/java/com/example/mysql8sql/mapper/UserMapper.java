package com.example.mysql8sql.mapper;

import com.example.mysql8sql.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {

    // 登录
    // 利用mysql8特性进行sql注入
    @Select("select id,username,password from user where username='${username}' and password='${password}'")
    User login(@Param("username") String username, @Param("password") String password);

    // 查询所有用户信息
    // 使用order by 进行注入
    @Select("select * from user order by ${order}")
    List<User> getUsers(@Param("order") String order);
}
