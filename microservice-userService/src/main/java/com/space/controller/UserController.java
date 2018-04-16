package com.space.controller;

import com.space.dao.UserRepository;
import com.space.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名：com.space.controller.UserController.
 * 描述：
 * 创建者： ztzn.
 * 创建时间：2018/4/13.
 * 版本：V 1.0
 */


@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){

        return  userRepository.findOne(id);

    }

    @GetMapping("/instance-info")
    public ServiceInstance getServiceInstance(){
        return  discoveryClient.getLocalServiceInstance();
    }

}
