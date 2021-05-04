package com.hujf.project.basic;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;

/**
 * @author Hujf
 * @title: TransactionSpringConsumer
 * @date 2021-05-02 16:15
 * @description: TODO
 */
public class TransactionSpringConsumer {

    private String consemerGroupName;
    private String nameServerAddress;
    private String topicName;

    private DefaultMQPushConsumer consumer;
    private MessageListenerConcurrently messageListener;


    public TransactionSpringConsumer(String consemerGroupName,String nameServerAddress,String topicName,MessageListenerConcurrently messageListener){
        this.consemerGroupName = consemerGroupName;
        this.nameServerAddress = nameServerAddress;
        this.topicName= topicName;
        this.messageListener=messageListener;
    }

    public void init() throws MQClientException {
        consumer = new DefaultMQPushConsumer(consemerGroupName);
        consumer.setNamesrvAddr(nameServerAddress);

        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        consumer.subscribe(topicName,"*");

        consumer.registerMessageListener(messageListener);
        consumer.start();
    }

    public void destory(){
        consumer.shutdown();
    }

    public DefaultMQPushConsumer getConsumer(){
        return consumer;
    }
}
