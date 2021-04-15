package com.hujf.project.es.controller;

import com.alibaba.fastjson.JSON;
import com.hujf.project.es.config.EsConfig;
import lombok.Data;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author Hujf
 * @title: TestController
 * @date 2021/3/2415:57
 * @description: TODO
 */

@RestController
public class TestController {

    @Autowired
    private RestHighLevelClient client;
    @GetMapping("/test")
    public void t(){


        GetRequest searchRequest = new GetRequest("pms_product","doc","1");
        try {
            GetResponse response = client.get(searchRequest, RequestOptions.DEFAULT);
            System.out.println(client);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    //测试存储数据
    @GetMapping(value = "/save")
    public void indexData(){
        IndexRequest request = new IndexRequest("users");
        request.id("2");
//        request.source("username","胡剑峰","age","18");
        User user = new User();
        user.setUsername("胡222");
        user.setAge(18);
        String json = JSON.toJSONString(user);
        request.source(json, XContentType.JSON);
        try {
            IndexResponse response= client.index(request, EsConfig.COMMON_OPTIONS);
            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Data
    class User{
        private String username;
        int age;
    }


    //测试存储数据
    @GetMapping(value = "/search")
    public void searchData() throws IOException {
        //创金检索所以
        SearchRequest searchRequest = new SearchRequest();
        searchRequest.indices("users");
        //创建查询条件
        SearchSourceBuilder builder = new SearchSourceBuilder();
        searchRequest.source(builder);

        //执行检索
        SearchResponse response = client.search(searchRequest, EsConfig.COMMON_OPTIONS);
        // 分析结果
        System.out.println(response);
    }
}
