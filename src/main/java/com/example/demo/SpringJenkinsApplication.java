package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	Logger logger=(Logger) LoggerFactory.getLogger(SpringJenkinsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
