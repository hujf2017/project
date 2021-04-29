package com.hujf.project.controller;

import com.hujf.project.service.OrderService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hujf
 * @title: OrderController
 * @date 2021-04-29 15:21
 * @description: TODO
 */
@Api("订单接口")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/create")
    public boolean create(){
       return  orderService.create();
    }
}
