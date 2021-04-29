package com.hujf.project.service.impl;

import com.alibaba.fastjson.JSON;
import com.hujf.project.model.MyOrder;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author Hujf
 * @title: ConsumerServiceImpl
 * @date 2021-04-29 18:28
 * @description: TODO
 */
@Service
@RocketMQMessageListener(consumerGroup = "my-group", topic = "springboot",selectorExpression = "*")
public class ConsumerServiceImpl implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        MyOrder myOrder = JSON.parseObject(s,MyOrder.class);
        //更新对象
        System.out.println("更新了"+myOrder.toString());
    }
}
