package org.example.entity;

public class Dog implements Animal {

    public Dog() {
        System.out.println("The dog bean is created!");
    }

    public void voice() {
        System.out.println("Gow-gow");
    }
}
