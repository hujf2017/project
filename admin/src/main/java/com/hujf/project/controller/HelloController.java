package com.hujf.project.controller;

import com.hujf.project.common.result.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hujf
 * @title: HelloController
 * @date 2020/10/10 0010下午 3:10
 * @description: TODO
 */

@Api(value = "HelloController", tags = "测试接口hello")
@RestController()
@RequestMapping("/hello")
public class HelloController {

    @ApiOperation(value = "getHello" , notes = "test"
            , httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/get/hello", method = RequestMethod.POST)
    public CommonResult<String> getHello(){
        return CommonResult.success("hello");
    }


    @ApiOperation(value = "getHello2" , notes = "test2"
            , httpMethod = "GET")
    @RequestMapping(value = "/get/hello2", method = RequestMethod.GET)
    public String getHello2(){
        return "sdsa";
    }
}
