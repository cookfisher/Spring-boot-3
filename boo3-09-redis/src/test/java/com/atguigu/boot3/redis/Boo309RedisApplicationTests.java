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
	StringRedisTemplate stringRedisTemplate;

	@Test
	void contextLoads() {
		stringRedisTemplate.opsForValue().set("haha", UUID.randomUUID().toString());
		var haha = stringRedisTemplate.opsForValue().get("haha");
		System.out.println(haha);
	}

	@Test
	void testList() {
		String alist = "alist";
		stringRedisTemplate.opsForList().leftPush(alist, "1");
		stringRedisTemplate.opsForList().leftPush(alist, "2");
		stringRedisTemplate.opsForList().leftPush(alist, "3");

		String pop = stringRedisTemplate.opsForList().leftPop(alist);
		Assertions.assertEquals("3", pop);
	}

	@Test
	void testSet() {
		String aset = "aset";
		stringRedisTemplate.opsForSet().add(aset, "1", "2", "2", "3");
		Boolean aBoolean = stringRedisTemplate.opsForSet().isMember(aset, "1");
        Assertions.assertEquals(Boolean.TRUE, aBoolean);
	}

}
