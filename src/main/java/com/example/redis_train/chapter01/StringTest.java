package com.example.redis_train.chapter01;

import com.example.redis_train.util.Connect;
import io.lettuce.core.api.sync.RedisCommands;

public class StringTest {
    public static RedisCommands<java.lang.String, java.lang.String> redisCommands=Connect.redis;
    public static void test(){
        redisCommands.set("string","value");
        redisCommands.get("string");

    }
}
