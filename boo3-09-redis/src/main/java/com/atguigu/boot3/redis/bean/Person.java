package com.atguigu.boot3.redis.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//@Component
//@ConfigurationProperties(prefix = "person")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {

    private Long id;
    private String userName;
    private String email;
    private Integer age;

}
