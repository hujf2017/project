package com.hujf.project.controller;

import com.hujf.project.common.result.CommonResult;
import com.hujf.project.service.MemberService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Hujf
 * @title: LoginController
 * @date 2020/10/10 0010下午 5:27
 * @description: 登录接口
 */

@Api(value = "login",description = "登录相关接口")
@RestController
@RequestMapping("/login")
public class LoginController {

    @Resource
    MemberService memberService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ApiOperation(value = "register",notes = "注册相关",httpMethod="POST")
    public CommonResult register(String username,String password,String telephone, String authCode){
        memberService.register(username,password,telephone,authCode);
        return CommonResult.success(null,"注册成功");
    }
}
