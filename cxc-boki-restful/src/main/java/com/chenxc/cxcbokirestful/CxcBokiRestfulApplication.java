package com.chenxc.cxcbokirestful;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cxc
 */
@EnableDubbo
@SpringBootApplication
public class CxcBokiRestfulApplication {

    public static void main(String[] args) {
        System.err.println("=========================================================================欢迎使用CXC服务=========================================================================");
        SpringApplication.run(CxcBokiRestfulApplication.class, args);
    }

}
