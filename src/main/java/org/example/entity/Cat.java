package org.example.entity;

public class Cat implements Animal {

    public Cat() {
        System.out.println("The cat bean is created!");
    }

    public void voice() {
        System.out.println("Meow");
    }
}
