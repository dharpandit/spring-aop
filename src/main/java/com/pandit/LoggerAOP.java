package com.pandit;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggerAOP {

    @Pointcut("execution (* com.pandit.Math.*(..))")
    public void Math() {}

    @Before("Math()")
//    @Before("execution (* com.pandit.Math.*(..))")
    public void startMethod(JoinPoint joinPoint){
        System.out.println("***************************Method starting.....***************************");
    }

//    @AfterReturning("execution (* com.pandit.Math.*(..))")
    @After("Math()")
    public void endMethod(JoinPoint joinPoint){
        System.out.println("***************************Method ended.....***************************");
    }
}

