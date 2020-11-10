package error;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

/**
 * @author Hujf
 * @title: SyncProducer
 * @date 2020/11/9 0009下午 8:34
 * @description: TODO
 */
public class SyncProducer {
    public static  void main(String[] args) throws Exception{
        DefaultMQProducer producer = new DefaultMQProducer("error");

        producer.setNamesrvAddr("101.7.163.175:9876");
        producer.setRetryTimesWhenSendAsyncFailed(3);
        producer.start();

        // 发送消息 三个参数 一个topic名  一个标签 一个内容
        String msg = "用户A给用户B发消息";
        Message message = new Message("error-topic","SEND",msg.getBytes("UTF-8"));
        SendResult sendResult =  producer.send(message,1000);
        System.out.println("消息id:"+sendResult.getMsgId());
        System.out.println("消息队列:"+sendResult.getMessageQueue());
        System.out.println(sendResult);
        producer.shutdown();
    }
}
