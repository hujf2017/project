package transaction;

import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.TransactionListener;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hujf
 * @title: TransactionalListenerImpl
 * @date 2020/11/9 0009下午 1:57
 * @description: 监听实现类
 */
public class TransactionalListenerImpl implements TransactionListener {

    private static Map<String,LocalTransactionState> STATE_MAP = new HashMap();
    /**
     * 执行具体的业务
     * @param msg
     * @param arg
     * @return
     */

    @Override
    public LocalTransactionState executeLocalTransaction(Message msg, Object arg) {

        try {
            System.out.println("用户A账单减1000");
            Thread.sleep(500);
           // System.out.println(1/0);
            System.out.println("用户B账单加1000");
            Thread.sleep(800);

            STATE_MAP.put(msg.getTransactionId(),LocalTransactionState.COMMIT_MESSAGE);
            //二次提交
            return LocalTransactionState.UNKNOW;
        } catch (Exception e) {
            e.printStackTrace();
        }
       STATE_MAP.put(msg.getTransactionId(),LocalTransactionState.ROLLBACK_MESSAGE);
        //回滚
        return LocalTransactionState.ROLLBACK_MESSAGE;
    }

    /**
     * 消息回查
     * @param msg
     * @return
     */
    @Override
    public LocalTransactionState checkLocalTransaction(MessageExt msg) {
        return STATE_MAP.get(msg.getTransactionId());
    }
}
