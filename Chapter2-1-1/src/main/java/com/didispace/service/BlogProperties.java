package com.didispace.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/5/5 下午12:16.
 * @blog http://blog.didispace.com
 */
@Data
@Component
public class BlogProperties {

    @Value("${user.home}")
    private String home;

    @Value("${com.didispace.blog.name}")
    private String name;
    @Value("${com.didispace.blog.title}")
    private String title;
    @Value("${com.didispace.blog.desc}")
    private String desc;

    @Value("${com.didispace.blog.value}")
    private String value;
    @Value("${com.didispace.blog.number}")
    private Integer number;
    @Value("${com.didispace.blog.bignumber}")
    private Long bignumber;
    @Value("${com.didispace.blog.test1}")
    private Integer test1;
    @Value("${com.didispace.blog.test2}")
    private Integer test2;
}
