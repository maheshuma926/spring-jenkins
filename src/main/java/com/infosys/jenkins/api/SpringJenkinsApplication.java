package com.infosys.jenkins.api;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started...");
		logger.info("Application changes-1...");
	}
	
	public static void main(String[] args) {
		logger.info("Application started...in main()");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
