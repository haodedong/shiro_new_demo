package com.hdd.siro_new_demo.dao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 项目名称
 *
 * @author bill.hao
 * @create 2018/10/26 下午 2:28
 */
@Component
@ConfigurationProperties(prefix = "com.ddd")
public class TestConfiguration {
  private   String a;
  private   String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
