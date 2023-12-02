package org.example.entity;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("catBean")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Cat implements Animal {

    public Cat() {
        System.out.println("The cat bean is created!");
    }

    public void voice() {
        System.out.println("Meow");
    }

}