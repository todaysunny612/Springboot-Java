package com.springboot.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2) // OpenAPI 3.0 사용
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.springboot.api")) // API 패키지 설정
                .paths(PathSelectors.any()) // 모든 경로 포함
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot Open API Test with Swagger")
                .description("설명 부분")
                .version("1.0.0")
                .build();
    }

    //기존 코드에 Swagger 명세 추가
@RestController
@RequestMapping("/api")
class MyController {

    @ApiOperation(value = "GET 메서드 예제", notes = "@RequestParam을 활용한 GET 메서드")
    @GetMapping(value = "/request1")

    public String getRequestParam1(
            @ApiParam(value = "이름 ", required = true) @RequestParam String name,
            @ApiParam(value = "이메일 ", required = true) @RequestParam String email,
            @ApiParam(value = "회사 ", required = true) @RequestParam String organization)
    {
        return name + " " + email + " " + organization;
    }}}
