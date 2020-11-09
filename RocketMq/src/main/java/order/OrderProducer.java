package order;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
 * @author Hujf
 * @title: OrderProducer
 * @date 2020/11/8 0008下午 7:54
 * @description: TODO
 */
public class OrderProducer {
    public static void main(String[] args) throws Exception{
        DefaultMQProducer producer = new DefaultMQProducer("project-order");
        producer.setNamesrvAddr("101.7.163.175:9876");
        producer.start();

        for(int i=0;i<100;i++){
            int orderId = i%10;
            String msgStr = "order--> "+i+" orderId "+  orderId ;
            //模拟生成订单
            Message message = new Message("project_order_topic","ORDER",msgStr.getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult result = producer.send(message,(mqs,msg,arg)->{
                Integer id =(Integer)arg;
                int index = id%mqs.size();
                return mqs.get(index);
            },orderId);
            System.out.println(result);
        }
        producer.shutdown();

    }
}
