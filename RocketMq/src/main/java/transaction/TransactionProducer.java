package transaction;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author Hujf
 * @title: TransactionProducer
 * @date 2020/11/9 0009下午 1:49
 * @description: 消息队里事务
 */
public class TransactionProducer {
    public static void main(String[] args) throws Exception {
        //事务消息生产者
        TransactionMQProducer producer = new TransactionMQProducer("project-transaction");
        //设置ip端口号
        producer.setNamesrvAddr("116.62.138.50:9876");
        //设置事务监听
        producer.setTransactionListener(new TransactionalListenerImpl());
        producer.start();

        //创建消息
        Message message = new Message("pay_topic","A给B转账500元".getBytes("UTF-8"));
        producer.sendMessageInTransaction(message,null);
        Thread.sleep(9999999);
        producer.shutdown();

    }
}
