package com.hdd.siro_new_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

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
/*
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSourceProperties people() {

        return new DataSourceProperties();
    }*/
}
