package xyz.hujf.mq.example.batch;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Hujf
 * @title: SimpleBatchProducer
 * @date 2021-04-29 9:33
 * @description: TODO
 */
public class SimpleBatchProducer {

    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer("lalala");
        producer.setNamesrvAddr("hadoop100:9876");
        producer.start();


        String topic = "TopicTest";
        List<Message> messageList = new ArrayList<>();
        messageList.add(new Message(topic,"Tags","order001","Hello world 0".getBytes(StandardCharsets.UTF_8)));
        messageList.add(new Message(topic,"Tags","order002","Hello world 1".getBytes(StandardCharsets.UTF_8)));
        messageList.add(new Message(topic,"Tags","order003","Hello world 2".getBytes(StandardCharsets.UTF_8)));
        producer.send(messageList);
        producer.shutdown();

    }
}
