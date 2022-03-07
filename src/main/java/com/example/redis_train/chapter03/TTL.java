package com.example.redis_train.chapter03;

import com.example.redis_train.util.Connect;
import io.lettuce.core.api.sync.RedisCommands;
import org.junit.Test;

public class TTL {
    public static RedisCommands<String, String> redisCommands= Connect.redis;
    @Test
    public void test(){
        System.out.println();

        System.out.println("ttlllll"+redisCommands.ttl("list"));
        System.out.println(redisCommands.expire("list",999));
        System.out.println(redisCommands.persist("list"));
       // redisCommands.pexpireat("list",)
    }
}
