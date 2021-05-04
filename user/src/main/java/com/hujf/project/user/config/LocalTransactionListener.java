package com.hujf.project.user.config;

import com.alibaba.fastjson.JSON;
import com.hujf.project.mapper.UserMapper;
import com.hujf.project.model.User;
import com.hujf.project.user.domain.UserPointMessage;
import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.TransactionListener;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Hujf
 * @title: LocalTransactionListener
 * @date 2021-05-02 15:56
 * @description: TODO
 */
@Service
public class LocalTransactionListener implements TransactionListener {
    @Autowired
    private UserMapper userMapper;
    @Override
    public LocalTransactionState executeLocalTransaction(Message message, Object o) {
        System.out.println("本地事务执行");
        //先保存用户
        UserPointMessage messages =  JSON.parseObject(message.getBody(),UserPointMessage.class);
        User user = new User();
        user.setUserName(messages.getUserName());
        user.setId(messages.getUserId());
        userMapper.insert(user);
        return LocalTransactionState.COMMIT_MESSAGE;
    }

    @Override
    public LocalTransactionState checkLocalTransaction(MessageExt messageExt) {
        System.out.println("消息回调接口");

        UserPointMessage message = JSON.parseObject(messageExt.getBody(),UserPointMessage.class);
        if(message!=null){
            Integer userId = message.getUserId();
            if(userId!=null){
                System.out.println("到这说明OK了");
                return LocalTransactionState.COMMIT_MESSAGE;
            }

        }
        return LocalTransactionState.ROLLBACK_MESSAGE;
    }
}
