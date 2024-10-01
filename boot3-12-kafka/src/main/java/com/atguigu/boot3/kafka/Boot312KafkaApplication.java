package com.atguigu.boot3.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class Boot312KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot312KafkaApplication.class, args);
    }

}
