package org.example;

import org.example.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        On this step we already can get rid of xml configuration creating context based on annotations:
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org/example/");

        Person person = context.getBean("personBean", Person.class);

        person.getAnimal().voice();
        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
