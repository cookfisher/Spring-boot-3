package com.atguigu.boot3.kafka;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.StopWatch;

import java.util.concurrent.CompletableFuture;

@SpringBootTest
class Boot312KafkaApplicationTests {

    @Autowired
    KafkaTemplate kafkaTemplate;

    @Test
    void contextLoads() {
        StopWatch stopWatch = new StopWatch();
        CompletableFuture[] futures = new CompletableFuture[10000];

        stopWatch.start();
        for (int i=0; i<10000; i++) {
            CompletableFuture future = kafkaTemplate.send("newshaha", "haha"+i, "HaHaHa"+i);
            futures[i] = future;
        }
        CompletableFuture.allOf(futures).join();
        stopWatch.stop();
        var totalTimeMillis = stopWatch.getTotalTimeMillis();
        System.out.println("10000 news sent, time used in " + totalTimeMillis);
    }

}
