//package com.hujf.project.basic;
//
//import com.hujf.project.config.ExRocketMQTemplate;
//import org.apache.rocketmq.spring.core.RocketMQTemplate;
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
//    private RocketMQTemplate template;
//
//    public void sendMessage (String topic ,String message){
//        this.template.convertAndSend(topic,message);
//    }
//}
