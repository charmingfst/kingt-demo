package com.chm.demo.test;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class Test {
    public static void main(String[] args) {
        final String separator = System.getProperty("line.separator");
        System.out.println(separator);
        log.info("error");
        Boolean res = StringUtils.isNoneBlank("");
        System.out.println(res);
    }
}
