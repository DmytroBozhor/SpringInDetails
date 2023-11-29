package org.example;

import org.example.entity.Animal;
import org.example.entity.Cat;
import org.example.entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        singleton - meaning all the code will share the bean
//        such beans are created as soon as the Spring context is instantiated and initialized
        Animal orangeCat = context.getBean("animal", Cat.class);
        Animal blackCat = context.getBean("animal", Cat.class);

        System.out.println(orangeCat==blackCat);

        context.close();
    }
}
