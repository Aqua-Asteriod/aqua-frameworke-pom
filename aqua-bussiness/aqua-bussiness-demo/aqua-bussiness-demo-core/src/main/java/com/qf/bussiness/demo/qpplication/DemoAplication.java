package com.qf.bussiness.demo.qpplication;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author pww
 * @date 2021/10/18
 * @apiNote
 */
@SpringBootApplication
//@MapperScan("com.qf.data.demo")
public class DemoAplication {
    public static void main(String[] args) {

        System.out.println("aaaaaaaaaa");
        SpringApplication.run(DemoAplication.class, args);
    }
}
