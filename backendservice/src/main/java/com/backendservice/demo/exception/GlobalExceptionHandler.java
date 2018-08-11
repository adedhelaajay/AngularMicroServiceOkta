/**
 * 
 */
package com.backendservice.demo.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Ajay
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	

	public static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@ResponseStatus(value= HttpStatus.FORBIDDEN, reason="No sessionId")  // 403
	@ExceptionHandler(Exception.class)
	public Map<String, Object> SessionIdNotFoundException() {
		logger.info("Error Condition, missing sessionId. Please login for sessionId.");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("sessionId", UUID.randomUUID().toString());
		return model;
	}
	
/*	@ResponseStatus(value= HttpStatus.FORBIDDEN, reason="No sessionId")  // 403
	@ExceptionHandler(Exception.class)
	public void SessionIdNotFoundException() {
		logger.info("Error Condition, missing sessionId. Please login for sessionId.");
		
	}*/

}
