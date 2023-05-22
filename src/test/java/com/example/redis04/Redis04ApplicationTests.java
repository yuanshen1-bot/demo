package com.example.redis04;

import com.example.redis04.pojo.User;
import com.example.redis04.utils.RedisUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class Redis04ApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void test1()
    {
        redisUtil.set("name", "jjm");
        System.out.println(redisUtil.get("name"));
    }

    @Test
    public void test() throws JsonProcessingException
    {
        User user = new User("狂神说", 3);
      //  String jsonUser = new ObjectMapper().writeValueAsString(user);    // 将其序列化，在redis中所有对象需要序列化
        redisTemplate.opsForValue().set("user", user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

}
