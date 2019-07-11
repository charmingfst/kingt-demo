package com.chm.demo.controller;

import com.chm.demo.jwt.Audience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {
    @Autowired
    private Audience audience;
    @RequestMapping(value = "/secure", method = RequestMethod.GET)
    public String loginSuccess() {
        System.out.println(audience.getName());
        return "Login Successful!";
    }
}
