package com.razzyspring.udemyspringcourse.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring
{
    public static void main(String[] args) {
        //1. Launch a Spring Context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {


            //2. Configure the things that we want Spring to manage
            System.out.println(context.getBean("name"));

            System.out.println(context.getBean("age"));

            System.out.println(context.getBean("person"));

            System.out.println(context.getBean("person2MethodCall"));

            System.out.println(context.getBean("person3Parameters"));

            System.out.println(context.getBean("address"));

            System.out.println(context.getBean(HelloWorldConfiguration.Address.class));

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);


        }
    }
}
// @Primary annotation and @Qualifier("name")