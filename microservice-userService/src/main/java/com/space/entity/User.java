package com.space.entity;

import javax.persistence.*;

/**
 * 类名：com.space.entity.User.
 * 描述：用户信息模型
 * 创建者： ztzn.
 * 创建时间：2018/4/13.
 * 版本：V 1.0
 */


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private  String username;


    @Column
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
