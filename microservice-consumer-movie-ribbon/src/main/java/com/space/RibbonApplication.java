package com.space;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 类名：com.space.RibbonApplication.
 * 描述：ribbon
 * 创建者： ztzn.
 * 创建时间：2018/4/13.
 * 版本：V 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    public static void main( String[] args )
    {
        SpringApplication.run(RibbonApplication.class,args);
        System.out.println( "Hello World!" );
    }
}
