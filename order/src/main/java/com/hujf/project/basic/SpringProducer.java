//package com.hujf.project.basic;
//
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.client.producer.DefaultMQProducer;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
///**
// * @author Hujf
// * @title: SpringProducer
// * @date 2021-04-29 15:59
// * @description: TODO
// */
//@Component
//public class SpringProducer {
//
//    @Resource
//    private DefaultMQProducer producer;
//
//    public SpringProducer(){
//        producer.setNamesrvAddr("hadoop100:9876");
//        try {
//            producer.start();
//        } catch (MQClientException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
