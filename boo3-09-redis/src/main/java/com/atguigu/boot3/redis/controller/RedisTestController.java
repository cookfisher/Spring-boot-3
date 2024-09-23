package com.atguigu.boot3.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/count")
    public String count() {

        var hello = redisTemplate.opsForValue().increment("hello");
        return "Visited ["+hello+"] times";
    }
}
