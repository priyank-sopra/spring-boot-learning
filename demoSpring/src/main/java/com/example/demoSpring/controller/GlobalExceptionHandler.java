package com.example.demoSpring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demoSpring.exception.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = RuntimeException.class)
	public ResponseEntity<ErrorResponse> catchRuntimeException(RuntimeException ex){

		ErrorResponse errorResponse = new ErrorResponse();

		errorResponse.setCode(HttpStatus.BAD_REQUEST.toString());
		errorResponse.setMessage(ex.getMessage());

		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);

	}
}
