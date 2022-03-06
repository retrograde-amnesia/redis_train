package com.example.redis_train;

import com.example.redis_train.chapter01.*;
import com.example.redis_train.chapter03.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedisTrainApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void chapter1String(){
        StringTest.test();
        StringTest.redisCommands.del("string");
    }
    @Test
    void chapter1List(){
        ListTest.test();
    }
    @Test
    void chapter1Set(){
        SetTest.test();
    }
    @Test
    void chapter1Hash(){
        HashTest.test();
    }
    @Test
    void chapter1ZSet(){
        ZSetTest.test();
    }
    @Test
    void chapter3String(){
        StringTest3.test();
    }
    @Test
    void chapter3String2(){
        StringTest3.test2();
    }
    @Test
    void chapter3List(){
        ListTest3.test();
    }
    @Test
    void chapter3List2(){
        ListTest3.test2();
    }
    @Test
    void chapter3Set(){
        //SetTest3.test();
    }
    @Test
    void chapter3Set2(){SetTest3.test2();}
    @Test
    void chapter3Hash(){
        HashTest3.test();
    }
    @Test
    void chapter3Hash2(){
        HashTest3.test2();
    }
    @Test
    void chapter3Zset(){
        ZSetTest3.test();
    }
    @Test
    void chapter3Zset2(){
        ZSetTest3.test2();
    }

}
