package com.bgrulers.configs;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


// ControllerAdvice applies the functionality to all @Controller classes
@ControllerAdvice
public class ControllerConfig {

    // For example if a field is non nullable
    // and null value is sent it will change the response to BAD_REQUEST
    // instead of 500
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(value= HttpStatus.BAD_REQUEST, reason = "Invalid data sent to server")
    public void notValid() {
        // add some code if needed
    }
}