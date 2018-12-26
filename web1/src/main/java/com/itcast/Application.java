package com.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by qd on 2018/12/26.
 */
@SpringBootApplication
//开启缓存
//@EnableCaching
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
