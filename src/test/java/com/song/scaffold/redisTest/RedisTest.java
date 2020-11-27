package com.song.scaffold.redisTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    StringRedisTemplate stringRedisTemplate;//操作字符串
    @Autowired
    RedisTemplate redisTemplate;//操作对象的

    /**
     * stringRedisTemplate.opsForList()
     * stringRedisTemplate.opsForHash()
     * ........
     */
    @Test
    public void test1(){
        stringRedisTemplate.opsForValue().append("msg","hello");
        String msg = stringRedisTemplate.opsForValue().get("msg");
        System.out.println(msg);
    }

    /**
     * 测试保存对象
     * ①redis存储对象默认是存序列化数据
     * ②自己将对象转换成json格式数据
     * ③改变redis底层序列化机制
     */
    @Test
    public void test2(){

    }
}
