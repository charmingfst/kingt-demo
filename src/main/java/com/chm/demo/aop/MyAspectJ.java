package com.chm.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectJ {
//    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
//    public void doPointcut() {
//    }
//
//    @Before("doPointcut()")
//    public void doBefore(JoinPoint joinPoint) {
//        System.out.println(joinPoint.getSignature().getName()+" 方法执行！");
//    }
}
