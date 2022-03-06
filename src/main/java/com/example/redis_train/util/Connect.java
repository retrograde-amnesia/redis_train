package com.example.redis_train.util;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import io.lettuce.core.pubsub.RedisPubSubListener;
import io.lettuce.core.pubsub.api.async.RedisPubSubAsyncCommands;
import  io.lettuce.core.pubsub.api.sync.RedisPubSubCommands;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;

public class Connect {
     static RedisClient  client;
     static StatefulRedisConnection<String, String> connection;
    public static RedisCommands<String, String> redis;
    public static RedisPubSubAsyncCommands<String,String> pubredis;
    static{
          client = RedisClient.create("redis://localhost:6379/0");
         //redis=  client.connectPubSub().async();
      /**  client.connectPubSub().addListener(new RedisPubSubListener<String, String>() {
            @Override
            public void message(String channel, String message) {

            }

            @Override
            public void message(String pattern, String channel, String message) {

            }

            @Override
            public void subscribed(String channel, long count) {

            }

            @Override
            public void psubscribed(String pattern, long count) {

            }

            @Override
            public void unsubscribed(String channel, long count) {

            }

            @Override
            public void punsubscribed(String pattern, long count) {

            }
        });*/
       // redis.subscribe();
       // redis.unsubscribe();
       // redis.
         connection = client.connect(); // 获取一个连接
        redis = connection.sync(); // 获取同步指令集
        pubredis=client.connectPubSub().async();

        // connection.close(); // 关闭连接
        // client.shutdown(); // 关闭所有连接
    }
}
