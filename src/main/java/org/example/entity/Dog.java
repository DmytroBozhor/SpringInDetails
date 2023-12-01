package org.example.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dogAnimal")
@Scope()
public class Dog implements Animal {

    public Dog() {
        System.out.println("The dog bean is created!");
    }

    public void voice() {
        System.out.println("Gow-gow");
    }
}
