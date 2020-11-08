package createtopic;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;

/**
 * @author Hujf
 * @title: TopicDemo
 * @date 2020/11/8 0008下午 3:06
 * @description: 创建topic
 */
public class TopicDemo {
    public static void main(String []args) throws MQClientException {
        DefaultMQProducer producer = new DefaultMQProducer("hujf");

        producer.setNamesrvAddr("101.7.163.175:9876");
        producer.start();

        producer.createTopic("brokertest","my-topic",4);
        System.out.println("topic 创建成功");

        producer.shutdown();
    }
}
