package com.didispace.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 */
@RestController
public class HelloController {

    @ApiIgnore
    @GetMapping("/hello")
    public String index() {
        return "Hello World";
    }

}