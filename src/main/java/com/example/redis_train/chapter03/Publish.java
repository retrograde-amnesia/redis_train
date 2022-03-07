package com.example.redis_train.chapter03;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Publish {
    @Resource
    private RedisTemplate redisTemplate;
    @Test
    public void test(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            redisTemplate.convertAndSend("test1","这是我发送的第"+i+"个消息");
        }
    }
}