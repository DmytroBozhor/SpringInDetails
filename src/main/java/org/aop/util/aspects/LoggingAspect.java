package org.aop.util.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
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

    @AfterReturning("allAddMethodsPointcut()")
    public void afterReturningAddBookAdvice(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggingAspect :: afterReturningAddBookAdvice :: methodInfo :: " + signature);
    }

    @AfterThrowing(pointcut = "allAddMethodsPointcut()", throwing = "ex")
    public void afterThrowingAddBookAdvice(Throwable ex) {
        System.out.println("LoggingAspect :: afterThrowingAddBookAdvice :: methodInfo :: exception logging :: " + ex);
    }

    @Around("execution(public String getSchoolName())")
    public String aroundAddMethodAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        System.out.println("LoggingAspect :: afterReturningAddBookAdvice :: methodInfo :: " + methodName + " :: start");

        String schoolName = (String) proceedingJoinPoint.proceed();

        System.out.println("LoggingAspect :: afterReturningAddBookAdvice :: methodInfo :: " + methodName + " :: end");
        return schoolName;
    }

    //This one will be executed in both cases
//    @After("allAddMethodsPointcut()")
//    public void afterAddBookAdvice(JoinPoint joinPoint) {
//        Signature signature = joinPoint.getSignature();
//        System.out.println("LoggingAspect :: afterAddBookAdvice :: methodInfo :: " + signature);
//    }

}
