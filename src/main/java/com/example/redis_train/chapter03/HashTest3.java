package com.example.redis_train.chapter03;

import com.example.redis_train.util.Connect;
import io.lettuce.core.api.sync.RedisCommands;

import java.util.HashMap;
import java.util.LinkedList;

public class HashTest3 {
    public static RedisCommands<String, String> redisCommands= Connect.redis;
    public static void test (){
       // redisCommands.hmset("hash",new HashMap<String,String>());
        redisCommands.hmget("hash","sd","sd","f");
        redisCommands.hdel("hash","s","dfs","ds");
        redisCommands.hlen("hash");
    }
    public static void test2(){
        redisCommands.hexists("hash","as");
        redisCommands.hkeys("hash");
        redisCommands.hvals("hash");
        redisCommands.hgetall("hash");
       // redisCommands.hset("hash","78","上的覅哦啊是");
       // redisCommands.hincrby("hash","78",9);
        redisCommands.hincrbyfloat("hash","2",0.344);
    }
}
