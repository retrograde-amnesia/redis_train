package com.example.redis_train.chapter03;

import com.example.redis_train.util.Connect;
import io.lettuce.core.api.sync.RedisCommands;
import io.lettuce.core.pubsub.api.async.RedisPubSubAsyncCommands;
import io.lettuce.core.pubsub.api.sync.RedisPubSubCommands;
import org.junit.Test;

public class SetTest3 {
    public static RedisPubSubCommands<String,String> redisCommands= Connect.pubredis;
    @Test
    public  void test(){
        redisCommands.sadd("set","3 1","3 2","3 3");
        redisCommands.srem("set","3 3");
        redisCommands.sismember("set","3 1");
        redisCommands.scard("set");
        redisCommands.smembers("set");
        redisCommands.srandmember("set");
        redisCommands.spop("set");
        redisCommands.smove("set","newset","3 2");
    }
    public static void test2(){
        redisCommands.sdiff("set","notexist");
        redisCommands.sdiffstore("notexist","set","newset");
        redisCommands.sinter("set","newset");
        redisCommands.sinterstore("notexist","set");
        redisCommands.sunion("set");
        redisCommands.sunionstore("notexist","set");
    }
}
