package xyz.hujf.mq.example.order;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.consumer.listener.MessageListenerOrderly;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author Hujf
 * @title: OrderConsumer
 * @date 2021-04-28 21:42
 * @description: TODO
 */
public class OrderConsumer {

    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("please_rename_3");
        consumer.setNamesrvAddr("hadoop100:9876");
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);
        consumer.subscribe("OrderTopicTest","*");

        consumer.registerMessageListener((MessageListenerOrderly) (list, consumeOrderlyContext) -> {
            consumeOrderlyContext.setAutoCommit(true);
            for(MessageExt msg:list){
               System.out.println( "收到消息"+new String(msg.getBody()));
            }
            return ConsumeOrderlyStatus.SUCCESS;
        });

        System.out.println("消费者启动");
        consumer.start();
    }
}
