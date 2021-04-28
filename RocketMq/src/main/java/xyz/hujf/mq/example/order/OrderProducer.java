package xyz.hujf.mq.example.order;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.MessageQueueSelector;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author Hujf
 * @title: OrderProducer
 * @date 2021-04-28 21:42
 * @description: TODO
 */
public class OrderProducer {
    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer("please_rename_3");
        producer.setNamesrvAddr("hadoop100:9876");
        producer.start();

        for(int i=0;i<10;i++){
            int orderId = i;
            for(int j=0;j<=5;j++){
                Message msg = new Message("OrderTopicTest","order_"+orderId,"KEY"+orderId,("order_"+orderId+" step "+j).getBytes(StandardCharsets.UTF_8));
                SendResult sendResult = producer.send(msg, (list, message, o) -> {
                    Integer id  =(Integer) o;
                    int index = id%list.size();

                    return list.get(index);
                },orderId);

                System.out.println(sendResult);
            }
        }
    }
}
