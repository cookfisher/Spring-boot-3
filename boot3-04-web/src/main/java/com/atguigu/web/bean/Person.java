package com.atguigu.web.bean;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

//@Component
//@ConfigurationProperties(prefix = "person")
@JacksonXmlRootElement
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Person {

    private Long id;
    private String userName;
    private String email;
    private Integer age;

}
