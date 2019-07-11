package com.chm.demo.aop;

import org.springframework.stereotype.Component;

@Component
public class JdkProxyTestImpl implements JdkProxyTest {
    @AopPointcut
    @Override
    public void hello(Class c) {
        System.out.println("hello jdk:"+c);
    }
}
