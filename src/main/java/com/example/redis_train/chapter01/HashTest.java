package com.example.redis_train.chapter01;

import com.example.redis_train.util.Connect;
import io.lettuce.core.api.sync.RedisCommands;

public class HashTest {
    public static RedisCommands<String, String> redisCommands= Connect.redis;
    public static void test(){
        redisCommands.hset("hash","1","1");
        redisCommands.hset("hash","2","2");
        redisCommands.hget("hash","1");
        redisCommands.hgetall("hash");
        redisCommands.hdel("hash","1");
    }
}
