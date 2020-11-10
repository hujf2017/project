package error;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.common.protocol.heartbeat.MessageModel;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author Hujf
 * @title: ConsumerDemo
 * @date 2020/11/8 0008下午 5:10
 * @description: TODO
 */
public class ConsumerDemo {
    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("hujf-consumer");
        consumer.setNamesrvAddr("101.7.163.175:9876");
        //订阅消息 *代表全部
        consumer.subscribe("my-topic", "*");

        consumer.setMessageModel(MessageModel.CLUSTERING);
        //MessageListenerConcurrently 并发型
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {

                for (MessageExt msg : list) {
                    try {
                        System.out.println("收到消息->" + new String(msg.getBody(),"UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("收到消息->" + list);
                if(list.get(0).getReconsumeTimes()>=3){
                    return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
                }
                return ConsumeConcurrentlyStatus.RECONSUME_LATER;
            }
        });
        consumer.start();
    }
}
