package order;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerOrderly;
import org.apache.rocketmq.common.message.MessageExt;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author Hujf
 * @title: OrderConsumer
 * @date 2020/11/8 0008下午 8:06
 * @description: TODO
 */
public class OrderConsumer {
    public static void main(String[] args) throws Exception{
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("project-order-consumer");
        consumer.setNamesrvAddr("101.7.163.175:9876");
        //订阅消息 *代表全部
        consumer.subscribe("project_order_topic", "*");
        consumer.registerMessageListener(new MessageListenerOrderly() {
            @Override
            public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs, ConsumeOrderlyContext context) {
               // System.out.println(Thread.currentThread().getName()+" Receive New Message: "+msgs);
                for(MessageExt msg:msgs) {
                    try {
                        System.out.println(Thread.currentThread().getName()  +" "+ msg.getQueueId()+" "+new String(msg.getBody(),"utf-8"));
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
                return ConsumeOrderlyStatus.SUCCESS;
            }
        });
        consumer.start();
    }
}
