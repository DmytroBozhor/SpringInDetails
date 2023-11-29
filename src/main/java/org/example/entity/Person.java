package org.example.entity;

public class Person {
    private Animal animal;
    private String name;
    private Integer age;

    public Person() {
        System.out.println("The person bean is created!");
    }

    public Person(Animal animal, String name, Integer age) {
        System.out.println("The person bean is created!");
        this.animal = animal;
        this.name = name;
        this.age = age;
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
