package com.hdd.siro_new_demo.dao;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.tomcat.jdbc.pool.DataSourceProxy;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

/**
 * 给mybatis注入sqlSession
 *
 * @author bill.hao
 * @create 2018/10/24 下午 6:32
 */
@Configuration
public class DemoDaoConfiguration {
@Autowired
    private DataSourceProxy dataSourceProperties;

   /* @Bean
     DataSourceProperties  createDProperties(){
        return dataSourceProperties;

    }*/

    @Bean
    SqlSessionFactoryBean createSqlSessionFactoryBean(){
       // DataSourceProperties  dataSourceProperties =new DataSourceProperties();
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(dataSourceProperties.getUrl());
        dataSource.setUsername(dataSourceProperties.getUsername());//用户名
        dataSource.setPassword(dataSourceProperties.getPassword());//密码
        dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        SqlSessionFactoryBean sqlSessionFactory=new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        return sqlSessionFactory;
    }

    @Bean
    MapperScannerConfigurer createMapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSession");
        mapperScannerConfigurer.setBasePackage("com.hdd.siro_new_demo.dao");
        mapperScannerConfigurer.setAnnotationClass(Repository.class);
        return mapperScannerConfigurer;
    }
}
