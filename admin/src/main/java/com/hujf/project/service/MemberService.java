package com.hujf.project.service;

import com.hujf.project.model.SmUser;

/**
 * @author Hujf
 * @title: MemberService
 * @date 2020/10/10 0010下午 5:35
 * @description: 用户信息服务接口
 */
public interface MemberService {

    void register(String username,String password,String telephone,String authCode);

}
