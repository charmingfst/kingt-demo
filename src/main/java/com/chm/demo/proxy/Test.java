package com.chm.demo.proxy;

public class Test {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        ServiceProxy serviceProxy = new ServiceProxy();
        serviceProxy.setService(service);
        Service instance = serviceProxy.getInstance();
        instance.add();
    }
}
