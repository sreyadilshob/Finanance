package com.finance.finance.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class APIExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler({ValidationException.class})
	ResponseEntity<ErrorMessage> handleValidationException(ValidationException exp) {
		ErrorMessage res = new ErrorMessage();
		res.setMessage(exp.getErrorm());
		res.setCode("123456");
		return new ResponseEntity<ErrorMessage>(res, HttpStatus.BAD_REQUEST);
		
	}

}
