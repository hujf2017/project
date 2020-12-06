package com.hujf.project.service;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Hujf
 * @title: TestService
 * @date 2020/12/6 0006下午 12:21
 * @description: TODO
 */

@Configurable
@FeignClient(value = "admin")
public interface TestService {

    @RequestMapping(value = "/hello/get/hello2")
    String hi();
}
