package com.sts.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecuritytokenserviceApplication {

	public static Logger logger = LoggerFactory.getLogger(SecuritytokenserviceApplication.class);
	
	public static void main(String[] args) {
		logger.info("Invoked SecuritytokenserviceApplication!");
		SpringApplication.run(SecuritytokenserviceApplication.class, args);
	}
}
