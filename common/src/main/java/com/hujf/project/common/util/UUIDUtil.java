package com.hujf.project.common.util;

import java.util.UUID;

/**
 * @author Hujf
 * @title: UuidUtil
 * @date 2020/10/10 0010下午 9:38
 * @description: TODO
 */
public class UUIDUtil {

    public static String getUUid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
