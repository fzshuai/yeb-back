package com.fzshuai.mail;

import com.fzshuai.server.pojo.MailConstants;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author 软件二班傅同学
 * @description 启动类
 * @date 2021-02-28 15:45
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MailApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class, args);
    }

    @Bean
    public Queue queue() {
        return new Queue(MailConstants.MAIL_QUEUE_NAME);
    }
}
