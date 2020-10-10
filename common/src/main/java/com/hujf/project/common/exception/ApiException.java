package com.hujf.project.common.exception;

/**
 * @author Hujf
 * @title: ApiException
 * @date 2020/10/10 0010下午 9:22
 * @description: TODO
 */
public class ApiException extends RuntimeException {

    public ApiException(String message) {
        super(message);
    }
}
