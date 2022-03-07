package com.example.redis_train.chapter03;

import com.example.redis_train.util.Connect;
import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.push.PushListener;
import io.lettuce.core.api.push.PushMessage;
import io.lettuce.core.api.sync.RedisCommands;
import io.lettuce.core.output.StreamingOutput;
import io.lettuce.core.pubsub.RedisPubSubListener;
import io.lettuce.core.pubsub.api.async.RedisPubSubAsyncCommands;
import io.lettuce.core.pubsub.api.sync.RedisPubSubCommands;
import org.junit.Test;

public class LisenTest implements Runnable {
    public RedisPubSubCommands<String,String> redisCommands= Connect.pubredis;
    public  RedisClient client=Connect.client;
    public StatefulRedisConnection<String,String> connection=client.connectPubSub();

    @Test
   public void run() {
        PushListener pushListener=new PushListener() {
            @Override
            public void onPushMessage(PushMessage message) {
                System.out.println("消息："+message);
            }
        };
        connection.addListener(pushListener);


        redisCommands.subscribe("channel");


    }


}
