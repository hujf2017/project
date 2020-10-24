package com.hujf.project.service;

import com.hujf.project.model.SmResource;

import java.util.List;

/**
 * @author Hujf
 * @title: ResourceService
 * @date 2020/10/21 0021下午 5:56
 * @description: TODO
 */
public interface SmResourceService {

    List<SmResource> listAll();

    int addResource(String path,String reName);

    List getAllResource();
}
