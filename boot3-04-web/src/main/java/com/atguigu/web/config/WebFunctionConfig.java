package com.atguigu.web.config;

import com.atguigu.web.bean.Person;
import com.atguigu.web.biz.UserBizHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.function.*;

@Configuration
public class WebFunctionConfig {

    @Bean
    public RouterFunction<ServerResponse> userRoute(UserBizHandler userBizHandler){

        return RouterFunctions.route()
                .GET("/user/{id}", RequestPredicates.accept(MediaType.ALL), userBizHandler::getUser)
                .GET("/users", userBizHandler::getUsers)
                .POST("/user", RequestPredicates.accept(MediaType.APPLICATION_JSON), userBizHandler::saveUser)
                .PUT("/user/{id}", RequestPredicates.accept(MediaType.APPLICATION_JSON), userBizHandler::updateUser)
                .DELETE("/user/{id}", userBizHandler::deleteUser)
                .build();

    }
}
