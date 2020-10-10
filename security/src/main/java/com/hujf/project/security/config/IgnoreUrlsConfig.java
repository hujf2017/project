package com.hujf.project.security.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hujf
 * @title: IgnoreUrlsConfig
 * @date 2020/10/10 0010下午 3:49
 * @description: 白名单配置
 */

@Data
@ConfigurationProperties(prefix = "secure.ignored")
@Component
public class IgnoreUrlsConfig {
    private List<String> urls = new ArrayList<>();
}
