package com.example.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 11:45
 */
@SpringBootApplication
@MapperScan(basePackages = "com.example.infrastructure.*.mapper")
@ComponentScan(basePackages = "com.example")
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
