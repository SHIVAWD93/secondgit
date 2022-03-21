package com.techno.CrudOperation.Exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.techno.CrudOperation.customeException.BussinessException;

@ControllerAdvice 
public class MyControllerAdvice extends ResponseEntityExceptionHandler{
	@ExceptionHandler(BussinessException.class)
	public ResponseEntity<String> handleBussiness(BussinessException be){
		return new ResponseEntity<String>("Expection at Service Layer", HttpStatus.BAD_REQUEST);
	}

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		return new ResponseEntity<Object>("Method is Not Supported Please Check the Method", HttpStatus.BAD_REQUEST);
	}
	
	
	
}
 