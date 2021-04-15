//package sendmessage;
//
//import org.apache.rocketmq.client.producer.DefaultMQProducer;
//import org.apache.rocketmq.client.producer.SendCallback;
//import org.apache.rocketmq.client.producer.SendResult;
//import org.apache.rocketmq.common.message.Message;
//
///**
// * @author Hujf
// * @title: AsyncProducer
// * @date 2020/11/8 0008下午 5:00
// * @description: 异步发送消息
// */
//public class AsyncProducer {
//    public static void main(String []args) throws Exception {
//        DefaultMQProducer producer = new DefaultMQProducer("hujf");
//
//        producer.setNamesrvAddr("116.62.138.50:9876;116.62.138.50:9877");
//        producer.start();
//
//        //发送消息
//        String msg = "我的第一个异步消息";
//        Message message = new Message("my-topic",msg.getBytes("UTF-8"));
//        producer.send(message, new SendCallback() {
//            @Override
//            public void onSuccess(SendResult sendResult) {
//                System.out.println("发送成功");
//                System.out.println(sendResult);
//            }
//
//            @Override
//            public void onException(Throwable throwable) {
//                System.out.println("发送失败"+throwable);
//            }
//        });
//
//        //producer.shutdown();
//    }
//}
