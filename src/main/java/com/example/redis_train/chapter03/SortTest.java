package com.example.redis_train.chapter03;

import com.example.redis_train.util.Connect;
import io.lettuce.core.Limit;
import io.lettuce.core.SortArgs;
import io.lettuce.core.api.sync.RedisCommands;
import org.junit.Test;

public class SortTest {
    public static RedisCommands<String, String> redisCommands= Connect.redis;
    @Test
    void test(){
        SortArgs sortArgs=new SortArgs();
        redisCommands.sort("sd", sortArgs);
        sortArgs.get("");
        sortArgs.by("");
        sortArgs.alpha();
        sortArgs.asc();
        sortArgs.desc();
       // Limit limit=new Limit(7L,9L);java: Limit(java.lang.Long,java.lang.Long) 在 io.lettuce.core.Limit 中是 protected 访问控制
       // sortArgs.limit(limit);
        sortArgs.limit(5,8);
    }
}
