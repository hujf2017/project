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

@Api(value = "login", description = "登录相关接口")
@RestController
@RequestMapping("/login")
public class LoginController {

    @Resource
    MemberService memberService;

    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "username", value = "用户名"),
            @ApiImplicitParam(paramType = "query", name = "password", value = "密码"),
            @ApiImplicitParam(paramType = "query", name = "telephone", value = "电话"),
            @ApiImplicitParam(paramType = "query", name = "authCode", value = "验证码")
    })
    @ApiOperation(value = "register", notes = "注册相关", httpMethod = "POST")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public CommonResult register(String username, String password, String telephone, String authCode) {
        memberService.register(username, password, telephone, authCode);
        return CommonResult.success(null, "注册成功");
    }

    @ApiOperation(value = "sendCode",notes = "发送验证码",httpMethod = "POST")
    @ApiImplicitParam(paramType = "query", name = "telephone", value = "电话")
    @RequestMapping(value = "/sendCode", method = RequestMethod.POST)
    public CommonResult<String> sendAuthCode(String telephone){
        String code =memberService.sendAuthCode(telephone);
        return CommonResult.success(code);
    }

    public CommonResult login(String username, String password){
        memberService.login(username,password);
        return CommonResult.success("");
    }

}
