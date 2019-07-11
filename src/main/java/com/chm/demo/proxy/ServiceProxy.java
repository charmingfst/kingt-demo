package com.chm.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceProxy implements InvocationHandler {

    private Service service;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Service getInstance() {
        Service newProxyInstance = (Service) Proxy.newProxyInstance(this.getClass().getClassLoader(), ServiceImpl.class.getInterfaces(), this);
        return newProxyInstance;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("开启事务");
        Object result = method.invoke(service, args);
        System.out.println("提交事务");

        return result;
    }
}
