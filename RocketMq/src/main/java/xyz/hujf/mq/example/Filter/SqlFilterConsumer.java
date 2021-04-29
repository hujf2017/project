package xyz.hujf.mq.example.Filter;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.MessageSelector;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

/**
 * @author Hujf
 * @title: SqlFilterConsumer
 * @date 2021-04-29 14:13
 * @description: TODO
 */
public class SqlFilterConsumer {

    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("sql");
        consumer.setNamesrvAddr("hadoop100:9876");
        consumer.subscribe("sqlFilterTest", MessageSelector.bySql("(TAGS is not null and TAGS in ('TagA','TagB'))"+"and (a is not null and between  0 and 3)"));
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                System.out.printf("%s receive new message : %s %n",Thread.currentThread().getName(),list);
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        consumer.start();
    }
}
