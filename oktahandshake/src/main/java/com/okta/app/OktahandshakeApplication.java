package com.okta.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@EnableOAuth2Sso
@SpringBootApplication
public class OktahandshakeApplication {
	
	public static Logger logger = LoggerFactory.getLogger(OktahandshakeApplication.class);

	public static void main(String[] args) {
		logger.info("Okta Handshake service invoked!");
		SpringApplication.run(OktahandshakeApplication.class, args);
	}
}
