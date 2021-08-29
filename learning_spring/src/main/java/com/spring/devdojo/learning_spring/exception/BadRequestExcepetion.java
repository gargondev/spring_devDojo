package com.spring.devdojo.learning_spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestExcepetion extends RuntimeException {


    public BadRequestExcepetion(String message) {
        super(message);
    }

}