package com.atguigu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.atguigu.springboot.mapper")

public class SpringBootHelloWorldNetworkSsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldNetworkSsmApplication.class, args);
	}

}
