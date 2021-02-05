package com.example.lesson27;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Lesson27Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Lesson27Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Lesson27Application.class);
	}
	//
	//demo demo

}

