package com.atguigu.boot3.redis.controller;

import com.atguigu.boot3.redis.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    
    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @GetMapping("/count")
    public String count() {

        var hello = stringRedisTemplate.opsForValue().increment("hello");
        return "Visited ["+hello+"] times";
    }

    @GetMapping("/person/save")
    public String savePerson(){
        Person person = new Person(1L, "Zhangsan", "zs@qq.com", 18);
        redisTemplate.opsForValue().set("person", person);
        return "ok";
    }

    @GetMapping("/person/get")
    public Person getPerson(){
        Person person = (Person) redisTemplate.opsForValue().get("person");
        return person;
    }

}
