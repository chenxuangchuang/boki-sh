package com.chenxc.cxcboki;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo
@SpringBootApplication
public class CxcBokiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxcBokiApplication.class, args);
    }

}
