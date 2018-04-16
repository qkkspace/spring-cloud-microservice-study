package com.space.controller;

import com.space.entity.User;
import com.space.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名：com.space.controller.UserController.
 * 描述：
 * 创建者： ztzn.
 * 创建时间：2018/4/13.
 * 版本：V 1.0
 */


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User findOne(@PathVariable Long id){
        return  this.userService.findUserById(id);
    }
}
