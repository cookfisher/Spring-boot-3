package com.atguigu.web.config;

import com.atguigu.web.component.MyYamlHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Configuration
public class MyConfig /*implements WebMvcConfigurer*/ {

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        WebMvcConfigurer.super.addResourceHandlers(registry);
//
//        registry.addResourceHandler("/static/**")
//                .addResourceLocations("classpath:/a/", "classpath:/b/")
//                .setCacheControl(CacheControl.maxAge(7200, TimeUnit.SECONDS));
//    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                WebMvcConfigurer.super.addResourceHandlers(registry);
                registry.addResourceHandler("/static/**")
                        .addResourceLocations("classpath:/a/", "classpath:/b/")
                        .setCacheControl(CacheControl.maxAge(7200, TimeUnit.SECONDS));
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry){

            }

            @Override
            public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
                converters.add(new MyYamlHttpMessageConverter());

            }
        };
    }


}
