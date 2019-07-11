package com.chm.demo.controller;

import com.chm.demo.model.Flower;
import com.chm.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {

    @Autowired
    private Person person;

//    @Autowired
//    @Qualifier("centerCharming")
//    private HikariConfig hikariConfig;

    @RequestMapping("/hello")
//    @ResponseBody
    private String sayHello() {
        System.out.println("person:"+person.getName());
        System.out.println("person:"+person.getAge());
        return "hello";
    }

    @GetMapping("/test")
    @ResponseBody
    private String getHi() {
        System.out.println("test:"+person.getName());
//        System.out.println("test:"+hikariConfig.getJdbcUrl());
//        System.out.println("test:"+hikariConfig.getPassword());
        return "hehe";
    }
    @RequestMapping("/hi")
    @ResponseBody
    private String sha(String[] aa) {
        System.out.println(aa[0]+","+aa[1]);
        return "haha";
    }

}
