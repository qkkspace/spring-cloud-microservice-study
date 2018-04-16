package com.space;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 用户微服务2
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
        System.out.println( "Hello World!" );
    }
}
