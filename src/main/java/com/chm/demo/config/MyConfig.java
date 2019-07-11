package com.chm.demo.config;

import com.chm.demo.model.Person;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Person getPerson() {
        return Person.builder().age(10).name("charming").build();
    }

//    @Bean(name = {"centerCharming"})
//    @ConfigurationProperties(prefix = "center.datasource")
//    public HikariConfig centerProperties() {
//        return new HikariConfig();
//    }

}
