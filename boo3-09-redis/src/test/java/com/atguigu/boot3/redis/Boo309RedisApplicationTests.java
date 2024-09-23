package com.atguigu.boot3.redis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.UUID;

@SpringBootTest
class Boo309RedisApplicationTests {

	@Autowired
	StringRedisTemplate redisTemplate;

	@Test
	void contextLoads() {
		redisTemplate.opsForValue().set("haha", UUID.randomUUID().toString());
		var haha = redisTemplate.opsForValue().get("haha");
		System.out.println(haha);
	}

	@Test
	void testList() {
		String alist = "alist";
		redisTemplate.opsForList().leftPush(alist, "1");
		redisTemplate.opsForList().leftPush(alist, "2");
		redisTemplate.opsForList().leftPush(alist, "3");

		String pop = redisTemplate.opsForList().leftPop(alist);
		Assertions.assertEquals("3", pop);
	}

	@Test
	void testSet() {
		String aset = "aset";
		redisTemplate.opsForSet().add(aset, "1", "2", "2", "3");
		Boolean aBoolean = redisTemplate.opsForSet().isMember(aset, "1");
        Assertions.assertEquals(Boolean.TRUE, aBoolean);
	}

}
