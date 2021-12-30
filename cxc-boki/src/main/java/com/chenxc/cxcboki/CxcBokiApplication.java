package com.chenxc.cxcboki;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = { "classpath:/config/applicationContext.xml" })
@EnableDubbo
@SpringBootApplication
public class CxcBokiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxcBokiApplication.class, args);
    }

}
