package com.mall.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MallServerApplication {

	public static void main(String[] args) {
		System.out.println("项目成功启动！！！");
		SpringApplication.run(MallServerApplication.class, args);
	}

}
