package com.example.redis_train.chapter01;

import com.example.redis_train.util.Connect;
import io.lettuce.core.api.sync.RedisCommands;

public class ZSetTest {
    public static RedisCommands<String, String> redisCommands= Connect.redis;
    public  static void test(){
        redisCommands.zadd("zset",1,"1");
        redisCommands.zadd("zset",2,"2");
        redisCommands.zrange("zset",1,1);
        redisCommands.zrangebyscore("zset",0,2);
        redisCommands.zrem("zset","1");
    }
}
