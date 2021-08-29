package com.spring.devdojo.learning_spring.handler;

import java.time.LocalDateTime;

import com.spring.devdojo.learning_spring.exception.BadRequestExcepetion;
import com.spring.devdojo.learning_spring.exception.BadRequestExcepetionDetails;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(BadRequestExcepetion.class)
    public ResponseEntity<BadRequestExcepetionDetails> handlerBadRequestExcepetion (
        BadRequestExcepetion bre
    ){
        return new ResponseEntity<>(
            BadRequestExcepetionDetails.builder()
                                .timeStamp(LocalDateTime.now())
                                .status(HttpStatus.BAD_REQUEST.value())
                                .title("Bad Request Check Documentation")
                                .details(bre.getMessage())
                                .developerMessage(bre.getClass().getName())
                                .build(), HttpStatus.BAD_REQUEST);
    }
    
}
