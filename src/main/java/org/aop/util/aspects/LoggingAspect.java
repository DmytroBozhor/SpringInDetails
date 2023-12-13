package org.aop.util.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut(value = "execution(void add*(..))")
    private void allAddMethodsPointcut() {
    }

    @Before("allAddMethodsPointcut()")
    public void beforeAddBookAdvice(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Optional<Object[]> args = Optional.ofNullable(joinPoint.getArgs());

        System.out.println("LoggingAspect :: beforeAddBookAdvice :: methodInfo :: " + signature);
        args.ifPresent(objects -> Arrays.asList(objects).forEach(System.out::println));
    }

    @After("allAddMethodsPointcut()")
    public void afterAddBookAdvice(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggingAspect :: afterAddBookAdvice :: methodInfo :: " + signature);
    }

}
