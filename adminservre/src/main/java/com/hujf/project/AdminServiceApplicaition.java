package com.hujf.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mail.MailSenderAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Hujf
 * @title: com.hujf.project.AdminServiceApplicaition
 * @date 2020/12/5 0005下午 5:59
 * @description: server启动类
 */


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, MailSenderAutoConfiguration.class})
@EnableEurekaServer
public class AdminServiceApplicaition {
    public static void main(String[] args) {
        SpringApplication.run(AdminServiceApplicaition.class,args);
    }
}
