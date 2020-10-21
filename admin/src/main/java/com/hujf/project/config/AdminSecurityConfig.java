package com.hujf.project.config;

import com.hujf.project.model.SmResource;
import com.hujf.project.security.component.DynamicSecurityService;
import com.hujf.project.security.config.SecurityConfig;
import com.hujf.project.service.MemberService;
import com.hujf.project.service.SmResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**metaDataSourceAdvisor
 * mall-security模块相关配置
 * Created by macro on 2019/11/9.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AdminSecurityConfig extends SecurityConfig {

    @Autowired
    private MemberService memberService;
    @Resource
    private SmResourceService resourceService;


    @Bean
    public DynamicSecurityService dynamicSecurityService() {
        return new DynamicSecurityService() {
            @Override
            public Map<String, ConfigAttribute> loadDataSource() {
                Map<String, ConfigAttribute> map = new ConcurrentHashMap<>();
                List<SmResource> resourceList = resourceService.listAll();
                for (SmResource resource : resourceList) {
                    map.put(resource.getResourceUrl(), new org.springframework.security.access.SecurityConfig(resource.getResourceName()));
                }
                return map;
            }
        };
    }
}
