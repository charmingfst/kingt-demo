package com.chm.demo.controller;

import com.chm.demo.service.ManServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManController {
    @Autowired
    private ManServer manServer;  // 测试事务用，很简单的一个小方法
    /**
     * 事务处理
     */
    @RequestMapping(value = "two")
    public void two(){
        manServer.insertTwo();
    }

}
