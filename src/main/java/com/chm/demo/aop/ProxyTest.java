package com.chm.demo.aop;

import org.springframework.stereotype.Component;

@Component
public class ProxyTest {
    @AopPointcut
    public void hello(Class c) {
        System.out.println("hello ciglib:"+c);
    }
}
