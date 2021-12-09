package com.mall.demo.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration // 只要是配置项，都需要加 @Configuration 注解
@EnableSwagger2  // 开启 swagger2
public class SwaggerConfig {
}
