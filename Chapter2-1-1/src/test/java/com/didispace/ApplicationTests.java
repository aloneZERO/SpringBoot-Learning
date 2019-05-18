package com.didispace;

import com.didispace.service.BlogProperties;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private BlogProperties blogProps;

	@Test
	public void test1() {
		assertEquals("程序猿DD", blogProps.getName());
		assertEquals("Spring Boot教程", blogProps.getTitle());
		assertEquals("程序猿DD正在努力写《Spring Boot教程》", blogProps.getDesc());

		log.info("用户目录 : {}", blogProps.getHome());
		log.info("随机数测试输出：");
		log.info("随机字符串 : {}", blogProps.getValue());
		log.info("随机int : {}" , blogProps.getNumber());
		log.info("随机long : {}" , blogProps.getBignumber());
		log.info("随机10以下 : {}", blogProps.getTest1());
		log.info("随机10-20 : {}" , blogProps.getTest2());
	}

}
