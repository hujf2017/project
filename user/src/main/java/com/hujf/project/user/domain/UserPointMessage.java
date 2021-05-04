package com.hujf.project.user.domain;

import lombok.Data;

/**
 * @author Hujf
 * @title: UserPointMessage
 * @date 2021-05-02 16:06
 * @description: TODO
 */
@Data
public class UserPointMessage {
    private int userId;
    private String userName;
    private Long amout;
}
