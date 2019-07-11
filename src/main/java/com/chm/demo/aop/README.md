springboot2.0的aop,不管有没有实现接口，默认使用的都是Cglib动态代理，如果想使用JDK动态代理，需要在配置文件中设置
spring.aop.proxy-target-class=false
那么使用aop时实现了接口的类就会使用****JDK动态代理****，没有实现接口的类仍然使用的是Cglib动态代理。
