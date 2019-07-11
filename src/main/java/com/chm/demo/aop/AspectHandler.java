package com.chm.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectHandler {

    @Pointcut("@annotation(com.chm.demo.aop.AopPointcut)")
    public void pointcut(){
    }

    @Before("pointcut()")
    public void before() {
        System.out.println("Aspect....before");
    }


}
