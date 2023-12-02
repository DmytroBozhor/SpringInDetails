package org.example;

import org.example.entity.Person;
import org.example.util.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Person person = context.getBean("personBean", Person.class);

        person.getAnimal().voice();
        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
