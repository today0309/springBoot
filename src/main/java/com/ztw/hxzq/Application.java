package com.ztw.hxzq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication：
 * 包含了@ComponentScan、@Configuration和@EnableAutoConfiguration注解。
 * 其中@ComponentScan让spring Boot扫描到Configuration类并把它加入到程序上下文。
 * 
 * @Configuration 等同于spring的XML配置文件；使用Java代码可以检查类型安全。
 * @EnableAutoConfiguration 自动配置。
 * @ComponentScan 组件扫描，可自动发现和装配一些Bean。
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
