package com.hujf.project.service.impl;

import com.alibaba.fastjson.JSON;
import com.hujf.project.domain.UserPointMessage;
import com.hujf.project.mapper.PointMapper;
import com.hujf.project.model.Point;
import com.hujf.project.service.PointService;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Hujf
 * @title: PointServiceImpl
 * @date 2021-05-03 10:04
 * @description: TODO
 */
@Service
@RocketMQMessageListener(consumerGroup = "my-group", topic = "dis_trans",selectorExpression = "*")
public class PointServiceImpl implements RocketMQListener<String> {
    @Autowired
    private PointMapper pointMapper;
    @Override
    public void onMessage(String s) {
        UserPointMessage pointMessage = JSON.parseObject(s,UserPointMessage.class);

        Point p = new Point();
        p.setAmount(pointMessage.getAmout());
        p.setUserId(pointMessage.getUserId());
        p.setId(0);
        pointMapper.insert(p);
    }
}
