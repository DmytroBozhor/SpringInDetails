package org.example.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("personBean")
@PropertySource("classpath:beans.properties")
public class Person {
    private Animal animal;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;

    public Person() {
        System.out.println("The person bean is created!");
    }

    @Autowired
    public Person(@Qualifier("catBean") Animal animal) {
        System.out.println("The person bean is created!");
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        System.out.println("Animal: Injection with setter!");
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name: Injection with setter!");
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("Age: Injection with setter!");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "animal=" + animal +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
