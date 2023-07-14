package com.razzyspring.udemyspringcourse.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration
{
    record Person(String name, int age, Address address){};
    record Address(String firstLine, String city){};
    @Bean
    public String name()
    {
        return "Abdul-Razak Hussein";
    }

    @Bean(name = "age")
    public int age()
    {
        return 35;
    }

    @Bean
    public Person person()
    {
        var person = new Person("Donald", 34, address());
        return person;
    }

    @Bean
    public Address address()
    {
        return new Address("Baker Street", "London");
    }

    @Bean
    public Person person2MethodCall()
    {
        return new Person(name(), age(), address());

    }
    @Bean
    public Person person3Parameters(String name, int age, Address address)
    {
        return new Person(name, age, address);

    }


}
