package com.example.redis_train.chapter03;

import com.example.redis_train.util.Connect;
import io.lettuce.core.api.sync.RedisCommands;

public class StringTest3 {
    public static RedisCommands<String, String> redisCommands= Connect.redis;
    public static void test(){
        redisCommands.incr("1");
        redisCommands.decr("-1");
        redisCommands.incrby("2",2);
        redisCommands.incrbyfloat("0.5",0.5);
        redisCommands.decrby("-3",3);
    }
    public static  void test2(){
       // redisCommands.append("7","7");
      //  redisCommands.getrange("string",0,3);
        //redisCommands.set("string","abcdefghigklmn");
        redisCommands.setrange("string",7,"  new 萨芬String");

    }
}
