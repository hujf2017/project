package com.hujf.project.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hujf
 * @title: MyBatisConfig
 * @date 2020/10/10 0010下午 9:44
 * @description:  MyBatis相关配置
 */

@Configuration
@MapperScan({"com.hujf.project.mapper","com.hujf.project.dao"})
public class MyBatisConfig {
}
