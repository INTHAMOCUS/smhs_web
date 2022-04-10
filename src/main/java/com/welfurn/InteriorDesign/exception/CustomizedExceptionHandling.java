package com.welfurn.InteriorDesign.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedExceptionHandling extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value=ValidationException.class)
    public ResponseEntity<Object> handleExceptions( Exception exception) {
        ResponseEntity<Object> entity = new ResponseEntity<>("The values of the passed parameters cannot be null.Kindly check",HttpStatus.NOT_ACCEPTABLE);
        
        return entity;
    }
    
    @ExceptionHandler(value=Exception.class)
    public ResponseEntity<Object> handleException( Exception exception) {
        ResponseEntity<Object> entity = new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_ACCEPTABLE);
        return entity;
    }
}
