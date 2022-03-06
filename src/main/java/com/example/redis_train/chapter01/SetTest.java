package com.example.redis_train.chapter01;

import com.example.redis_train.util.Connect;
import io.lettuce.core.api.sync.RedisCommands;

public class SetTest {
    public static RedisCommands<String, String> redisCommands= Connect.redis;
    public static void test(){
        redisCommands.sadd("set","1","2","3","4");
        redisCommands.smembers("set");
        redisCommands.sismember("set","2");
        redisCommands.srem("set","2");
    }
}
