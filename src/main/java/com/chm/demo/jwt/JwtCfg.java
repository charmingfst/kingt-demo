package com.chm.demo.jwt;

import com.google.common.collect.Lists;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class JwtCfg {

    public FilterRegistrationBean jwtFilter() {

//        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setFilter(new JwtFilter());
//        //添加需要拦截的url
//        List<String> urlPatterns = Lists.newArrayList();
//        urlPatterns.add("/secure/*");
//        registrationBean.addUrlPatterns(urlPatterns.toArray(new String[urlPatterns.size()]));
//        return registrationBean;

        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new JwtFilter());
        registrationBean.addUrlPatterns("/secure/*");
        return registrationBean;
    }

}
