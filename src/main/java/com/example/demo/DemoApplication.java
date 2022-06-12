package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	public void init(){
		logger.info("Application will Started...");
		logger.info("Application Started...");
		logger.info("Application Started...");
	}
	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(DemoApplication.class, args);
	}

}
