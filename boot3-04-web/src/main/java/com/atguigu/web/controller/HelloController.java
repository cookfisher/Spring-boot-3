package com.atguigu.web.controller;

import com.atguigu.web.Bean.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/person")
    public Person person(){
        Person person = new Person();
        person.setId(1L);
        person.setUserName("Asam");
        person.setEmail("aaa@qq.com");
        person.setAge(18);
        return person;
    }

    public static void aaa(String[] args) throws JsonProcessingException {
        Person person = new Person();
        person.setId(1L);
        person.setUserName("Asam");
        person.setEmail("aaa@qq.com");
        person.setAge(18);

        YAMLFactory yamlFactory = new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);
        ObjectMapper mapper = new ObjectMapper(yamlFactory);
        String s = mapper.writeValueAsString(person);
        System.out.println(s);
    }
}
