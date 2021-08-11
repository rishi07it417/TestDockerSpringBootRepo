package com.test.jdbctemplate.TestJDBCTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.SwaggerDefinition;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@ComponentScan(basePackages = "com.test.jdbctemplate.controller,com.test.jdbctemplate.services")
@EnableSwagger2
@SpringBootApplication
@Configuration
public class TestJdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestJdbcTemplateApplication.class, args);
	}

	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	        		 .select()                 
	        		 .apis(RequestHandlerSelectors.basePackage("com.test.jdbctemplate.controller"))
	        		 .paths(PathSelectors.any())
	                 .build();                                           
	    }
}
