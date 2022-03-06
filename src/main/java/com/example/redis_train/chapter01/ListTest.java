package com.example.redis_train.chapter01;

import com.example.redis_train.util.Connect;
import io.lettuce.core.api.sync.RedisCommands;

public class ListTest {
    public static RedisCommands<String, String> redisCommands= Connect.redis;
    public static void test(){
        redisCommands.rpush("list","1","2","3");
        redisCommands.lrange("list",0,-1);
        redisCommands.lindex("list",1);
        redisCommands.lpop("list");
    }
}
