package com.hujf.project.service.impl;

import com.hujf.project.mapper.SmUserMapper;
import com.hujf.project.model.SmUser;
import com.hujf.project.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Hujf
 * @title: MemberServiceIm
 * @date 2020/10/10 0010下午 5:36
 * @description: 用户服务接口实现类
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private SmUserMapper smUserMapper;



    @Override
    public void register(String username, String password, String telephone, String authCode) {

    }
}
