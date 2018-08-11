/**
 * 
 */
package com.okta.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ajay
 *
 */
@RestController
@RequestMapping("/")
public class OktaServiceController {

    @GetMapping("callback")
    public String echoTheUsersEmailAddress(Principal principal) {
        return "Hey there! Your email address is: " + principal.getName();
    }
    
    @GetMapping("/authorization")
    public String readToken(Object obj) {
    	return "Authorization required!";
    	
    }
}
