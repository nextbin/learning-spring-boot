package com.next.spring.boot.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author nextbin
 * @since 2018-04-01
 */
@ComponentScan("com.next.spring.boot.demo.controller")
@SpringBootApplication
public class NextSpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NextSpringBootDemoApplication.class, args);
    }
}
