package com.fzshuai.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 软件二班傅同学
 * @description 启动类
 * @date 2021-02-01 20:30
 */
@SpringBootApplication
@MapperScan("com.fzshuai.server.mapper")
@EnableScheduling
public class YebApplication {

    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class, args);
    }
}
