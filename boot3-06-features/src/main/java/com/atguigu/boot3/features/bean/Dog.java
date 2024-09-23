package com.atguigu.boot3.features.bean;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"test"})
@Data
@Component
public class Dog {
    private Long id;
    private String name;

}
