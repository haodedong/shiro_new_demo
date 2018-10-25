package com.hdd.siro_new_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author bill.hao
 * @create 2018/10/24 下午 6:34
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ShiroNewDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroNewDemoApplication.class, args);
    }
}
