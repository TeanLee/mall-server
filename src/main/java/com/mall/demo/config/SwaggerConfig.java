package com.mall.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * 配置 Swagger
 * swagger 的 bean 实例 Docket。用 docket 对象接管默认配置。
 */
@Configuration // 只要是配置项，都需要加 @Configuration 注解
@EnableSwagger2  // 开启 swagger2
public class SwaggerConfig {

    // 配置了swagger的Docket 的 bean 实例
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
//                .enable(false)  // enable 是否启动Swagger， 如果为false， 则Swagger 不能再浏览器中访问
                .select()
                // RequestHandlerSelectors, 配置要扫描的包
                // basePackage(): 指定要扫描的包
                // any(): 扫描全部
                // none(): 都不扫描
                // withClassAnnotation : 扫描类上的注解, 参数是一个注解的反射对象
                // 例如：withClassAnnotation(RestController.class) 只扫描类上有@RestController的生成文档
                // withMethodAnnotation: 扫描方法上的注解, 参数是一个注解的反射对象
                .apis(RequestHandlerSelectors.basePackage("com.mall.demo.controller"))
                .build();  //build;
    }

    // 配置 Swagger 信息 = apiInfo
    private ApiInfo apiInfo() {
        //作者信息
        Contact contact = new Contact("TeanLee", "https://github.com/TeanLee", "ltt598625763@163.com");
        return new ApiInfo(
                "商城小程序",
                "Api Documentation",
                "1.0",
                "urn:tos",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
