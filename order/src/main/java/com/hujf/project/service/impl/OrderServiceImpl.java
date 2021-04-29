package com.hujf.project.service.impl;

import com.alibaba.fastjson.JSON;
import com.hujf.project.mapper.MyOrderMapper;
import com.hujf.project.model.MyOrder;
import com.hujf.project.service.OrderService;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Hujf
 * @title: OrderServiceImpl
 * @date 2021-04-29 15:26
 * @description: TODO
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private MyOrderMapper orderMapper;
    @Autowired
    private RocketMQTemplate template;

    @Override
    public boolean create() {
        MyOrder order = new MyOrder();
        order.setStatus(1);
        int num =orderMapper.insert(order);
        if(num==1){
            sendDelayMessageCancelOrder(order);
            return true;
        }else{
            return false;
        }
    }

    private void sendDelayMessageCancelOrder(MyOrder order) {
        template.convertAndSend("springboot",JSON.toJSONString(order));
    }
}
