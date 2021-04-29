package xyz.hujf.mq.example.Scheduled;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.nio.charset.StandardCharsets;

/**
 * @author Hujf
 * @title: MessageProducer
 * @date 2021-04-29 9:05
 * @description: TODO
 */
public class MessageProducer {

    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer("ScheduledExample");
        producer.setNamesrvAddr("hadoop100:9876");
        producer.start();
        int totalMessageToSend = 2;
        for(int i=0;i<totalMessageToSend;i++){
            Message message = new Message("TopicTest",("hello scheduled message"+i).getBytes(StandardCharsets.UTF_8));
            message.setDelayTimeLevel(1);
            producer.send(message);
        }
        producer.shutdown();
    }
}
