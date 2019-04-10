package com.cts.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.cts.controller","com.cts.service","com.cts.util","com.cts.repo","com.cts.model","com.cts.vo"})
public class CtsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CtsTestApplication.class, args);
	}

}
