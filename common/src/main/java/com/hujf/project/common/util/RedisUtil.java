package com.hujf.project.common.util;

import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * @author Hujf
 * @title: RedisUtil
 * @date 2020/10/10 0010下午 2:47
 * @description: redis工具类
 */
public class RedisUtil {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;


}
