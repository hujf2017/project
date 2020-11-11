//package com.hujf.project.mq;
//
//import org.apache.rocketmq.spring.core.RocketMQTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
///**
// * @author Hujf
// * @title: SpringProducer
// * @date 2020/11/11 0011上午 10:15
// * @description: spring生产者
// */
//
//@Component
//public class SpringProducer {
//    //注入rocket
//    @Autowired(required=true)
//    private RocketMQTemplate template;
//
//    /**
//     * 发送消息
//     * @param topic
//     * @param msg
//     */
//    public void sendMsg(String topic,String msg){
//        this.template.convertAndSend(topic,msg);
//    }
//}
