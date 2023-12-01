package org.example.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("catBean")
    private Animal animal;
    private String name;
    private Integer age;

    public Person() {
        System.out.println("The person bean is created!");
    }

    //    @Autowired
//    public Person(@Qualifier("catBean") Animal animal) {
//        System.out.println("The person bean is created!");
//        this.animal = animal;
//    }

    public Animal getAnimal() {
        return animal;
    }

//    @Autowired
//    @Qualifier("catBean")
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
