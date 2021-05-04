//package com.hujf.project.user.config;
//
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.client.producer.DefaultMQProducer;
//import org.apache.rocketmq.client.producer.TransactionListener;
//import org.apache.rocketmq.client.producer.TransactionMQProducer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.Resource;
//import java.util.concurrent.ArrayBlockingQueue;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.ThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;
//
///**
// * @author Hujf
// * @title: TransactionSpringProducer
// * @date 2021-05-02 15:34
// * @description: 事务生产者
// */
//
//public class TransactionSpringProducer {
//
//    @Value("${rocketmq.producer.group}")
//    private String producerGroupName;
//    @Value("${rocketmq.nameServer}")
//    private String nameServerAddress;
//    private int corePoolSize = 1;
//    private int maxinumPoolSize = 5;
//    private long keepAliveTime = 100;
//    private TransactionMQProducer producer =new TransactionMQProducer();
//    @Autowired
//    private TransactionListener listener ;
//
//    public TransactionSpringProducer() {
//        //new TransactionSpringProducer(producerGroupName,nameServerAddress,corePoolSize,maxinumPoolSize,keepAliveTime,listener);
//    }
//
//    public TransactionSpringProducer(String producerGroupName, String nameServerAddress, int corePoolSize, int maxinumPoolSize, long keepAliveTime, TransactionListener listener) {
//        this.producerGroupName = producerGroupName;
//        this.nameServerAddress = nameServerAddress;
//        this.corePoolSize = corePoolSize;
//        this.maxinumPoolSize = maxinumPoolSize;
//        this.keepAliveTime = keepAliveTime;
//        this.listener = listener;
//    }
//    public void init(TransactionListener listener) throws MQClientException {
//        producer.setProducerGroup("my-group");
//        producer.setNamesrvAddr("192.168.9.129:9876");
//        ExecutorService executorService = new ThreadPoolExecutor(corePoolSize, maxinumPoolSize, keepAliveTime, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2000), (Runnable r) -> {
//            Thread t = new Thread(r);
//            t.setName("client trans mag check thread");
//            return t;
//        });
//
//        producer.setExecutorService(executorService);
//        producer.setTransactionListener(listener);
//        producer.start();
//    }
//
//    public void destory() {
//        producer.shutdown();
//    }
//
//    public DefaultMQProducer getProducer() {
//        return producer;
//    }
//
//    public void serT() {
//        producer.setTransactionListener(listener);
//        try {
//            producer.start();
//        } catch (MQClientException e) {
//            e.printStackTrace();
//        }
//    }
//}
