package me.dio.cloudapi.Exceptions;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalExcep {
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleIllegal(IllegalArgumentException businessExc){
		
		return new ResponseEntity<>(businessExc.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
		
	}
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuch(NoSuchElementException businessExc){
		
		return new ResponseEntity<>("Resource ID not found", HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<String> handleThrowable(Throwable businessExc){
		
		return new ResponseEntity<>("Unexpected server error", HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
}
