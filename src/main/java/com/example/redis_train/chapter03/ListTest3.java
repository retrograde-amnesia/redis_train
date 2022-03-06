package com.example.redis_train.chapter03;

import com.example.redis_train.util.Connect;
import io.lettuce.core.api.sync.RedisCommands;

public class ListTest3 {
    public static RedisCommands<String, String> redisCommands= Connect.redis;
    public static void test(){
         redisCommands.rpush("list","right");
        redisCommands.lpush("list","left");
       redisCommands.rpop("list");
        redisCommands.lpop("list");
        redisCommands.lindex("list",1);
        redisCommands.lrange("list",0,-1);
        redisCommands.ltrim("list",0,-1);
    }
    public static void test2(){
        //redisCommands.blpop(7,"b7");
        //redisCommands.brpop(7,"b7");
        //redisCommands.lpush("b7","1","2","3");
        redisCommands.rpoplpush("b7","list");

    }
}
