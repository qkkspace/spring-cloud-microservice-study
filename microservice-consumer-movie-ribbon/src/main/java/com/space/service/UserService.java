package com.space.service;

import com.space.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 类名：com.space.service.UserService.
 * 描述：
 * 创建者： ztzn.
 * 创建时间：2018/4/13.
 * 版本：V 1.0
 */


@Service
public class UserService {

    @Value("userServiceUrl")
    private String userServiceUrl;

    @Autowired
    private RestTemplate restTemplate;
    public User findUserById(Long id){
        return  this.restTemplate.getForObject(userServiceUrl+id,User.class);
    }
}
