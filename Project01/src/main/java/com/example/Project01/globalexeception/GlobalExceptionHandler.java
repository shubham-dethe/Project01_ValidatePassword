package com.example.Project01.globalexeception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.Project01.exception.UserServiceException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserServiceException.class)
	ResponseEntity<String> handleUserServiceException(UserServiceException userServiceException) {

		return new ResponseEntity<String>(userServiceException.getMessage(), userServiceException.getHttpStatus());
	}

}
