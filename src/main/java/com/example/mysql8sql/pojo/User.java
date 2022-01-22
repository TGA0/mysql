package com.example.mysql8sql.pojo;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "user")
public class User {
    // 用户id
    @Id
    private Integer id;
    // 用户名
    @Column
    private String username;

    // 密码
    @Column
    private String password;

}

