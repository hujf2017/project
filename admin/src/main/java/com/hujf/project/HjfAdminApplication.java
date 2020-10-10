package com.hujf.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动入口
 * Created by macro on 2018/4/26.
 */
@SpringBootApplication
public class HjfAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(HjfAdminApplication.class, args);
        System.out.println("启动成功");
    }
}
