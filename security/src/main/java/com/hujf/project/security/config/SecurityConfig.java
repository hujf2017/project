package com.hujf.project.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

/**
 * @author Hujf
 * @title: SecurityConfig
 * @date 2020/10/10 0010下午 3:39
 * @description: SpringSecurity的配置的扩展，支持自定义白名单资源路径和查询用户逻辑
 * 集成springboot自带 WebSecurityConfigurerAdapter
 */

@Configurable
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private IgnoreUrlsConfig ignoreUrlsConfig;
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry = httpSecurity.authorizeRequests();
        //白名单中的资源无需过滤
        for (String url :ignoreUrlsConfig.getUrls()){
            registry.antMatchers(url).permitAll();
        }

        //关闭跨站请求 post问题
        registry.and().csrf().disable();

    }
}
