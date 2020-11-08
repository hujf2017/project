package sendMessage;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

/**
 * @author Hujf
 * @title: SyncProduce
 * @date 2020/11/8 0008下午 4:27
 * @description: TODO
 */
public class SyncProduce {
    public static  void main(String[] args) throws Exception{
        DefaultMQProducer producer = new DefaultMQProducer("hujf");

        producer.setNamesrvAddr("101.7.163.175:9876");
        producer.start();

        // 发送消息
        String msg = "我的第一个消息";
        Message message = new Message("my-topic","mytag",msg.getBytes("UTF-8"));
        SendResult sendResult =  producer.send(message);
        System.out.println("消息id:"+sendResult.getMsgId());
        System.out.println("消息队列:"+sendResult.getMessageQueue());
        System.out.println(sendResult);
        producer.shutdown();
    }
}
