package com.hujf.project;

import com.hujf.project.es.EsApplication;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Hujf
 * @title: estest
 * @date 2021/3/2415:43
 * @description: TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = EsApplication.class)
public class estest {

    @Autowired
    private RestHighLevelClient client;

    @Test
    public void contextLoads(){
        System.out.println(client);
    }
}
