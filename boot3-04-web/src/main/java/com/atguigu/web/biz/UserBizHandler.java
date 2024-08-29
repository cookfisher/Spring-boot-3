package com.atguigu.web.biz;

import com.atguigu.web.bean.Person;
import jakarta.servlet.ServletException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class UserBizHandler {

    public ServerResponse getUser(ServerRequest request) throws Exception{
        String id = request.pathVariable("id");
        log.info("Got [{}] user info.", id);
        Person person = new Person(1L, "Hary", "aa@qq.com", 18);
        return ServerResponse.ok().body(person);
    }

    public ServerResponse getUsers(ServerRequest request) throws Exception{
        log.info("Got all users info");
        List<Person> list = Arrays.asList(
                new Person(1L, "Hary", "aa@qq.com", 18),
                new Person(2L, "Henry", "aaa@qq.com", 12));
        return ServerResponse.ok().body(list);
    }

    public ServerResponse saveUser(ServerRequest request) throws ServletException, IOException {
        Person body = request.body(Person.class);
        log.info("One user {} info saved", body);
        return ServerResponse.ok().build();
    }

    public ServerResponse updateUser(ServerRequest request) throws ServletException, IOException {
        Person body = request.body(Person.class);
        log.info("One user info was updated: {}", body);
        return ServerResponse.ok().build();
    }

    public ServerResponse deleteUser(ServerRequest request) {
        String id = request.pathVariable("id");
        log.info("User [{}] info was deleted", id);
        return ServerResponse.ok().build();
    }
}
