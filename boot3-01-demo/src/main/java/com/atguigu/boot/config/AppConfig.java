package com.atguigu.boot.config;

import com.alibaba.druid.FastsqlException;
import com.atguigu.boot.bean.Pig;
import com.atguigu.boot.bean.Sheep;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Import(FastsqlException.class)
//@Configuration
@EnableConfigurationProperties(Sheep.class)
@SpringBootConfiguration
public class AppConfig {

    @ConfigurationProperties(prefix = "pig")
    @Bean
    public Pig pig(){
        return new Pig();
    }

    @Scope("prototype")
    @Bean("userHaha")
    public User user(){
        var user = new User();
        user.setId(1L);
        user.setName("James");
        return user;
    }
}
