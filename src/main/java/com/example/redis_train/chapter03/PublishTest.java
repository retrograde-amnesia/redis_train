package com.example.redis_train.chapter03;

import com.example.redis_train.util.Connect;
import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.pubsub.api.sync.RedisPubSubCommands;
import org.junit.Test;

public class PublishTest implements  Runnable{
    public RedisPubSubCommands<String,String> redisCommands= Connect.pubredis;
    public RedisClient client=Connect.client;
    public StatefulRedisConnection<String,String> connection=client.connectPubSub();
    @Test
   public void  run(){
        redisCommands.publish("channel","第一条消息");
    }
}
