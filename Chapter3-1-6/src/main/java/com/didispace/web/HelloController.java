package com.didispace.web;

import com.didispace.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 */
@Controller
public class HelloController {

    // 注意：默认已存在“/error”的映射，重复设置会报错
    @GetMapping("/testError")
    public String testError() throws Exception {
        throw new Exception("[VIEW] 发生错误");
    }

    @GetMapping("/json")
    public String json() throws MyException {
        throw new MyException("[JSON] 发生错误");
    }

    @GetMapping("/other")
    public String other() throws FileNotFoundException {
        throw new FileNotFoundException("其它错误~测试");
    }

    @GetMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "https://justzero.club");
        return "index";
    }

}