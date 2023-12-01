package org.example.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Animal {

    public Cat() {
        System.out.println("The cat bean is created!");
    }

    public void voice() {
        System.out.println("Meow");
    }

//    private void init(){
//        System.out.println("The cat bean's init method has been invoked.");
//    }

//    private void destroy(){
//        System.out.println("The cat bean's destroy method has been invoked.");
//    }
}