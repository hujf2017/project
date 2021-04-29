package xyz.hujf.mq.example.batch;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author Hujf
 * @title: SplitBatchProducer
 * @date 2021-04-29 10:34
 * @description: TODO
 */
public class SplitBatchProducer {
    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer("aaa");
        producer.setNamesrvAddr("hadoop100:9876");
        producer.start();

        String topic = "TopicTest";
        List<Message> message = new ArrayList<>(10000);
        for(int i=0;i<100000;i++){
          message.add(new Message(topic,"Tags","OrderId"+i,("hello world"+i).getBytes(StandardCharsets.UTF_8)));
        }
        ListSplitter splitter = new ListSplitter(message);
        while (splitter.hasNext()){
            List <Message> listItem = splitter.next();
            producer.send(listItem);
        }
      //  producer.send(message);
        producer.shutdown();
    }


}
class ListSplitter implements Iterator<List<Message>> {

    public List<Message> message ;
    private int currIndex;


    public ListSplitter(List<Message> message) {
        this.message = message;
    }

    @Override
    public boolean hasNext() {
        return currIndex<message.size();
    }

    @Override
    public List<Message> next() {
        int limit = 10000;
        int nextInt = currIndex;
        int totalSize = 0;


        for(;nextInt<message.size();nextInt++){
            List a = new ArrayList();
            Message messagesigl = message.get(nextInt);
            //单条信息总长度
            int tmpSize  = messagesigl.getTopic().length()+messagesigl.getBody().length;
            Map<String,String> m = messagesigl.getProperties();
            for(Map.Entry<String,String> e:m.entrySet()){
                tmpSize+=e.getKey().length()+e.getValue().length();
            }

            tmpSize+=20;
            if(tmpSize>limit){
                if(nextInt -currIndex==0){
                    nextInt++;
                }
                break;
            }

            if(tmpSize+totalSize>limit){
                break;
            }else{
                totalSize+=tmpSize;

            }
        }
        //直接截取字数组
        List <Message> subList = message.subList(currIndex,nextInt);
        currIndex = nextInt;
        return subList;
    }
}