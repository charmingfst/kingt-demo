package com.chm.demo.service;


import com.chm.demo.exception.ResultEnum;
import com.chm.demo.exception.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ManServer {
//    @Autowired
//    private ManRepository manRepository;

//    @Transactional                  // 业务，只要是增删改都建议用
    public void insertTwo(){
//        throw new UserException(ResultEnum.UNKONW_ERROR);
        int res = 1/0;
    }
}
