package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 激活不同的环境配置
 * <p>
 * java -jar xxx.jar --spring.profiles.active=prod
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        // 禁用命令行参数
//		app.setAddCommandLineProperties(false);
        app.run(args);
    }
}
