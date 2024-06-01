package com.atguigu.boot;

import com.alibaba.druid.FastsqlException;
import com.atguigu.boot.bean.Person;
import com.atguigu.boot.bean.Pig;
import com.atguigu.boot.bean.Sheep;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {

        var ioc = SpringApplication.run(MainApplication.class, args);

        Person person = ioc.getBean(Person.class);
        System.out.println("person: " + person);
//        String[] names = ioc.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }

//        var beanNamesForType = ioc.getBeanNamesForType(FastsqlException.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
//
//        var userHaha1 = ioc.getBean("userHaha");
//        var userHaha2 = ioc.getBean("userHaha");
//        System.out.println(userHaha2 == userHaha1);
//
//        Pig pig = ioc.getBean(Pig.class);
//        System.out.println("pig: "+ pig);
//
//        Sheep sheep = ioc.getBean(Sheep.class);
//        System.out.println("sheep: "+ sheep);
    }
}
