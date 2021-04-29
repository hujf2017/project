package xyz.hujf.mq.example.Filter;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.nio.charset.StandardCharsets;

/**
 * @author Hujf
 * @title: SqlFilterProducer
 * @date 2021-04-29 14:20
 * @description: TODO
 */
public class SqlFilterProducer {
    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer("filtter");
        producer.setNamesrvAddr("hadoop100:9876");
        producer.start();

        String []tags = new String[]{"TagA","TagB","TagC"};
        for(int i=0;i<15;i++){
            Message msg = new Message("sqlFilterTest",tags[i%tags.length],("hello world my bro"+i+tags[i%tags.length]).getBytes(StandardCharsets.UTF_8));
            msg.putUserProperty("a",String.valueOf(i));
            SendResult send = producer.send(msg);
            System.out.printf("%s\n",send);
        }
        producer.shutdown();
    }
}
