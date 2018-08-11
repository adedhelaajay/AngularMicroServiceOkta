/**
 * 
 */
package com.sts.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.resource.HttpResource;

/**
 * @author Ajay
 *
 */
@RestController
@RequestMapping("/")
public class STSController {

	public static Logger logger = LoggerFactory.getLogger(STSController.class);
	
    @GetMapping("/principal")
    public String echoTheUsersEmailAddress(Principal principal) {
    	logger.info("Request in the authorization service.");
        return "Hey there! Your email address is: " + principal.getName();
    }
    
    @GetMapping("/authorization")
    public String readToken() {
    	logger.info("Authorization callback infoked.");
    	return "Authorization required!";
    	
    }
}
