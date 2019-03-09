package com.enzo.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackages = {"com.enzo.controller"})
@EnableWebMvc
public class SwaggerConfig extends WebMvcConfigurationSupport {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("罗翰林 lwx641824", "http://3ms.huawei.com/hi/space/1525915", "luohanlin5@huawei.com");
        return new ApiInfoBuilder()
                .contact(contact)
                .title("开放接口API")
                .description("HTTP对外开放接口")
                .version("1.0.0")
                .termsOfServiceUrl("http://xxx.xxx.com")
                .license("LICENSE")
                .licenseUrl("http://xxx.xxx.com")
                .build();
    }
      
}