package com.dawnsky.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication  // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
    @RequestMapping("/")
    String home(){
        return  "hello world";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
