package org.example;

import org.example.entity.Animal;
import org.example.entity.Cat;
import org.example.entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal orangeCat = context.getBean("animal", Cat.class);
        Animal blackCat = context.getBean("animal", Cat.class);

//        Now we will se false as output because we use prototype scope for animal bean
        System.out.println(orangeCat==blackCat);

        context.close();
    }
}
