package com.atguigu.web.Bean;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

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
