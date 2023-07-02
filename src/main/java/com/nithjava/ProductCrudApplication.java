package com.nithjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.nithjava")
@Configuration
@SpringBootApplication
public class ProductCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCrudApplication.class, args);
	}
}
