package xyz.hujf.mq.example.broadcast;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.common.protocol.heartbeat.MessageModel;

import java.util.List;

/**
 * @author Hujf
 * @title: PushConsumer
 * @date 2021-04-28 23:39
 * @description: TODO
 */
public class PushConsumer {
    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("suibiancie");
        consumer.setNamesrvAddr("hadoop100:9876");
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);
       // consumer.setMessageModel(MessageModel.BROADCASTING);
        consumer.setMessageModel(MessageModel.CLUSTERING);
        consumer.subscribe("TopicTest","*");
//        consumer.registerMessageListener((list,context)->{
//            System.out.println("%s Receive new Message %s %n",Thread.currentThread().getName(),list);
//        });
        consumer.registerMessageListener((MessageListenerConcurrently) (list, consumeConcurrentlyContext) -> {
            for(MessageExt messageExt:list) {
                String messageBody = new String(messageExt.getBody());
                System.out.printf(" %s  receive new message %s %n\n", Thread.currentThread().getName(), messageBody);
            }
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        });
        consumer.start();
        System.out.println("start.");
    }
}
