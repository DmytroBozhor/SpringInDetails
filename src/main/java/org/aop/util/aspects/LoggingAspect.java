package org.aop.util.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void addBook())")
    public void beforeAddBookAdvice(){
        System.out.println("Start: addBook()");
    }

    @After("execution(public void addBook())")
    public void afterAddBookAdvice(){
        System.out.println("End: addBook()");
    }

}
