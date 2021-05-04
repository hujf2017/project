package com.hujf.project.user.controller;

import com.hujf.project.user.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Hujf
 * @title: UserController
 * @date 2021-05-02 16:56
 * @description: TODO
 */
@Api("用户接口")
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/create")
    public void createUser(String name,  Long account){
        userService.create(name,account);
    }
}
