/**
 * 
 */
package com.example.demo.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ajay
 *
 */
@Controller
@RequestMapping("/")
public class FrontEndServive {

	public static Logger logger = LoggerFactory.getLogger(FrontEndServive.class);

	Timestamp timestamp = new Timestamp(System.currentTimeMillis());

	@GetMapping("/ping")
	public void callFrontEndService() {
		logger.info("Front-End Service invoked!! TimeStamp: " + timestamp.getTime());
	}
	
    
    @GetMapping("/okta-auth")
    @ResponseBody
    public String readToken(String resp) {
    	logger.info("Okta authorization callback send.");
    	return "Authorization received from OKTA! Resp: " + resp;
    	
    }


}
