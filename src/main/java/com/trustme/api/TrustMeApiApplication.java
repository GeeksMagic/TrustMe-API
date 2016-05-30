package com.trustme.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages="com.trustme.api")
@SpringBootApplication
public class TrustMeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrustMeApiApplication.class, args);
	}
}
