package com.hujf.project.user.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Hujf
 * @title: UserService
 * @date 2021-05-02 16:58
 * @description: TODO
 */
@Transactional
public interface UserService {
     void create(String name, long account);
}
