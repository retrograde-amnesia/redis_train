package com.example.redis_train.chapter03;

import com.example.redis_train.util.Connect;
import io.lettuce.core.api.sync.RedisCommands;
import io.lettuce.core.pubsub.api.async.RedisPubSubAsyncCommands;
import io.lettuce.core.pubsub.api.sync.RedisPubSubCommands;

public class ZSetTest3 {
    public static RedisCommands<String, String> redisCommands= Connect.redis;
    public static void test(){
        redisCommands.zadd("zset",32,"sa");
       // redisCommands.zrem("zset","not","sf");
      //  redisCommands.zcard("zset");
        redisCommands.zincrby("zset",23,"sa");
      //  redisCommands.zcount("zset",2,32);
        System.out.println(redisCommands.zrank("zset","sa")+"  "+redisCommands.lindex("list",0));
        redisCommands.zscore("zset","32");
        redisCommands.zrange("zset",2,5);
    }
    public static void test2(){
        System.out.println(redisCommands.zrevrank("zset","sa"));
        System.out.println(redisCommands.zrank("zset","sa"));
        System.out.println(redisCommands.zrange("zset",0,-1));
        System.out.println(redisCommands.zrevrange("zset",0,-1));
        redisCommands.zrangebyscore("zset",2,3);
        redisCommands.zremrangebyscore("zset",100,800);
        redisCommands.zremrangebyrank("zset",2,8);
        redisCommands.zinterstore("newzset","zet","ss");
        redisCommands.zunionstore("newssssSet","zset","zdsaf");
    }
}
