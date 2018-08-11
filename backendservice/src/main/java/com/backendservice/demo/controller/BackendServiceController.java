/**
 * 
 */
package com.backendservice.demo.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backendservice.demo.user.User;

/**
 * @author Ajay
 *
 */
@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
public class BackendServiceController {
	
	public static Logger logger = LoggerFactory.getLogger(BackendServiceController.class);

	Timestamp timestamp = new Timestamp(System.currentTimeMillis());

	@GetMapping("/backend")
	public Map<String, Object> getServiceWithParams(@RequestParam(value="name") String name, @RequestParam(value="email") String email) {
		logger.info("Back-End Service invoked!! TimeStamp: " + timestamp.getTime() + "for name:" + name);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Backend Service");
		model.put("Name", name);
		model.put("Email", email);
		return model;

	}
	
	@PostMapping("/backend2")
	public Map<String, Object> getServiceWithObj(@RequestBody User user, HttpServletResponse resp) throws Exception {
		logger.info("Back-End Service invoked!! TimeStamp: " + timestamp.getTime() + "for name:" + user.getName());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("id", UUID.randomUUID().toString());
		if (validateUser(user).getStatusCode().is2xxSuccessful()) {
			model.put("content", "Backend Service");
			model.put("Name", user.getName());
			model.put("Email", user.getEmail());
			model.put("SessionId", user.getSessionId());			
		} else {
			model.put("SessionId", "No SessionId present.");
		}
		
		return model;

	}

	@PostMapping("/backend3")
	public Map<String, Object> getSession(@RequestBody User user, HttpServletResponse resp) throws Exception {
		logger.info("Back-End Service invoked!! TimeStamp: " + timestamp.getTime() + "for name:" + user.getName());
		user.setSessionId(UUID.randomUUID().toString());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("Name", user.getName());
		model.put("Email", user.getEmail());
		model.put("SessionId", user.getSessionId());
		
		return model;

	}

	private ResponseEntity<User> validateUser(User user) throws Exception {
		if (null != user.getSessionId()) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else throw new Exception();
	}
	
}
