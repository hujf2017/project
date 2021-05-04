package com.hujf.project.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.hujf.project.mapper.UserMapper;
import com.hujf.project.model.User;
import com.hujf.project.user.domain.UserPointMessage;
import com.hujf.project.user.service.UserService;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.TransactionListener;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;

/**
 * @author Hujf
 * @title: UserServiceImpl
 * @date 2021-05-02 16:58
 * @description: TODO
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper mapper;

    @Value("${rocketmq.producer.group}")
    private String producerGroupName;
    @Value("${rocketmq.nameServer}")
    private String nameServerAddress;
    private int corePoolSize = 1;
    private int maxinumPoolSize = 5;
    private long keepAliveTime = 100;
    @Autowired
    private TransactionListener listener ;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void create(String name, long account) {
        User user = new User();
        UserPointMessage message = new UserPointMessage();
        message.setUserName(name);
        message.setAmout(account);
        user.setUserName(name);
        mapper.insert(user);
        this.sendMessage(message);
    }
    @Autowired
    private RocketMQTemplate template;
    private void sendMessage1(UserPointMessage message)  {
        Message message1 = new Message();
        message1.setTopic("dis_trans");
        message1.setTags("addPoint");
        message1.setKeys("1");
        message1.setBody(JSON.toJSONString(message).getBytes(StandardCharsets.UTF_8));

        SendResult sendResult = null;

        template.convertAndSend("dis_trans",JSON.toJSONString(message1));
        System.out.println("发送"+sendResult);
    }


    private void sendMessage(UserPointMessage message)  {
        Message message1 = new Message();
        message1.setTopic("dis_trans");
        message1.setTags("addPoint");
        message1.setKeys("1");
        message1.setBody(JSON.toJSONString(message).getBytes(StandardCharsets.UTF_8));

        SendResult sendResult = null;
        template.convertAndSend("dis_trans",JSON.toJSONString(message1.getBody()));
        System.out.println("发送"+sendResult);
    }
}
