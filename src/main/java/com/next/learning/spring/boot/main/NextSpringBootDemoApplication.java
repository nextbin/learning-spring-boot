package com.next.learning.spring.boot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

/**
 * @author nextbin
 * @since 2018-04-01
 */
//@ComponentScan(value = {"com.next.spring.boot.demo.controller", "com.next.spring.boot.demo.entity"})
@ComponentScan(value = {"com.next.learning.spring.boot"})
@SpringBootApplication
public class NextSpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(NextSpringBootDemoApplication.class, args);
        Binder binder = Binder.get(context.getEnvironment());
        List<String> post = binder.bind("com.next.ref.url", Bindable.listOf(String.class)).get();
        System.out.println(post);
    }
}
