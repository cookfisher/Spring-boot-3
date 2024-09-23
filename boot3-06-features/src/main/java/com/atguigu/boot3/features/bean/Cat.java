package com.atguigu.boot3.features.bean;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"dev"})
@Data
@Component
public class Cat {
    private Long id;
    private String name;
    private Integer age;
}
