package com.woniu.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@MapperScan("com.woniu.dao")
@ComponentScan({"com.woniu.service","com.woniu.controller","com.woniu.serviceimp","com.woniu.configuration","com.woniu.util"})
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
