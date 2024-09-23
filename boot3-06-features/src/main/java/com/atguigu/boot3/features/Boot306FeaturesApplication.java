package com.atguigu.boot3.features;

import com.atguigu.boot3.features.bean.Cat;
import com.atguigu.boot3.features.bean.Dog;
import com.atguigu.boot3.features.bean.Pig;
import com.atguigu.boot3.features.bean.Sheep;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Boot306FeaturesApplication {

    public static void main(String[] args) {

        var ioc = SpringApplication.run(Boot306FeaturesApplication.class, args);
        try{
            log.info("Component cat: {}", ioc.getBean(Cat.class));
        }catch (Exception e){

        }
        try{
            log.info("Component dog: {}", ioc.getBean(Dog.class));
        }catch (Exception e){

        }
        try{
            log.info("Component pig: {}", ioc.getBean(Pig.class));
        }catch (Exception e){

        }
        try{
            log.info("Component sheep: {}", ioc.getBean(Sheep.class));
        }catch (Exception e){

        }

    }

}
