package com.spring.devdojo.learning_spring.exception;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BadRequestExcepetionDetails {

    private String title;
    private int status;
    private String details;
    private String developerMessage;
    private LocalDateTime timeStamp;

}