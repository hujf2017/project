package com.hujf.project.service.impl;

import com.hujf.project.common.util.UUIDUtil;
import com.hujf.project.mapper.SmResourceMapper;
import com.hujf.project.model.SmResource;
import com.hujf.project.model.SmResourceExample;
import com.hujf.project.service.MemberService;
import com.hujf.project.service.SmResourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Hujf
 * @title: SmResourceServiceImpl
 * @date 2020/10/21 0021下午 7:27
 * @description: TODO
 */
@Service
public class SmResourceServiceImpl implements SmResourceService {
    @Resource
    SmResourceMapper smResourceMapper;
    @Resource
    MemberService memberService;

    @Override
    public List<SmResource> listAll() {
        return smResourceMapper.selectByExample(new SmResourceExample());
    }

    @Override
    public int addResource(String path,String reName) {
        SmResource smResource = new SmResource();
        smResource.setResourcePk(UUIDUtil.getUUid());
        smResource.setResourceName(reName);
        smResource.setResourceUrl(path);
        smResource.setCreateTime(new Date());
        smResource.setCreator(memberService.getCurrentUser().getUserName());
        int num = smResourceMapper.insertSelective(smResource);
        return num;
    }

    @Override
    public List getAllResource(){
        return smResourceMapper.selectByExample(new SmResourceExample());
    }
}
