package com.example.student.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.student.AgeNotFountException.AgeNotFountException;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(AgeNotFountException.class)
	public ResponseEntity<Object> AgeHandler(AgeNotFountException s1) {
		return new ResponseEntity<>(s1.getMessage(), HttpStatus.NOT_FOUND);
	}
}
