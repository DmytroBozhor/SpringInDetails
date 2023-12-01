package org.example;

import org.example.entity.Animal;
import org.example.entity.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal orangeCat = context.getBean("animal", Cat.class);

        context.close();
    }
}
