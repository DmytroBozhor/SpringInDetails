package org.example;

import org.example.entity.Animal;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal animal = (Animal) context.getBean("animal");
        animal.voice();

        context.close();
    }
}
