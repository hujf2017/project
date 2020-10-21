package com.hujf.project.service.impl;

import com.hujf.project.mapper.SmResourceMapper;
import com.hujf.project.model.SmResource;
import com.hujf.project.model.SmResourceExample;
import com.hujf.project.service.SmResourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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


    @Override
    public List<SmResource> listAll() {
        return smResourceMapper.selectByExample(new SmResourceExample());
    }
}
