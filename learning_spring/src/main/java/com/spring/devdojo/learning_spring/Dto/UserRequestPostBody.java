package com.spring.devdojo.learning_spring.Dto;

import javax.validation.constraints.NotEmpty;


import lombok.Data;

@Data
public class UserRequestPostBody {
    
    @NotEmpty(message = "Name not be null or empty")
    private String name;
    
}
