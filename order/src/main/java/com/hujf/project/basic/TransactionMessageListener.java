package com.hujf.project.basic;

import com.alibaba.fastjson.JSON;
import com.hujf.project.domain.UserPointMessage;
import com.hujf.project.mapper.PointMapper;
import com.hujf.project.model.Point;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Hujf
 * @title: TransactionMessageListener
 * @date 2021-05-02 16:35
 * @description: TODO
 */
public class TransactionMessageListener implements MessageListenerConcurrently {

    @Autowired
    private PointMapper mapper;

    @Override
    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
        try {
            for (MessageExt messageExt : list) {
                System.out.println("收到消息：" + new String(messageExt.getBody()));
                UserPointMessage message = JSON.parseObject(messageExt.getBody(), UserPointMessage.class);
                if (message != null) {
                    Point point = new Point();
                    point.setUserId(message.getUserId());
                    point.setAmount(message.getAmout());
                    mapper.insert(point);
                }
            }
        }catch (Exception e){
            System.out.println("消费出问题："+e);
            return ConsumeConcurrentlyStatus.RECONSUME_LATER;
        }
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }
}
