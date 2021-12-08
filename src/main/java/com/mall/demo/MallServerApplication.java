package com.mall.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 在主程序设置 Servlet。效果：直接响应，没有经过拦截器
@SpringBootApplication
@MapperScan("com.mall.demo.mapper")  // 设置 mapper 文件的扫描路径，这样就不需要在每个 Mapper 文件上添加 @Mapper 注解了
public class MallServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallServerApplication.class, args);
	}

}
