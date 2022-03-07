package com.example.redis_train.chapter03;

import com.example.redis_train.util.Connect;
import io.lettuce.core.api.sync.RedisCommands;
import org.junit.Test;

public class Transaction {
    public static RedisCommands<String, String> redisCommands= Connect.redis;
    @Test
    public void test(){
        redisCommands.multi();
        redisCommands.lpush("List","transaction");
        redisCommands.rpop("list");
        redisCommands.exec();
    }
}
