package com.chm.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

    private String name;
    private String password;
    private Integer age;

}
