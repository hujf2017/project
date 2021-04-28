package sendmessage;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

/**
 * @author Hujf
 * @title: SyncProduce
 * @date 2020/11/8 0008下午 4:27
 * @description: 同步发送消息
 */
public class SyncProduce {
    public static  void main(String[] args) throws Exception{
        DefaultMQProducer producer = new DefaultMQProducer("hujf");

        producer.setNamesrvAddr("hadoop100:9876");
        producer.start();

        // 发送消息 三个参数 一个topic名  一个标签 一个内容
        String msg = "我的第一个消息6";
        Message message = new Message("my-topic","and",msg.getBytes("UTF-8"));
        SendResult sendResult =  producer.send(message);
        System.out.println("消息id:"+sendResult.getMsgId());
        System.out.println("消息队列:"+sendResult.getMessageQueue());
        System.out.println(sendResult);
        producer.shutdown();
    }
}
