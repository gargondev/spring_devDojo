package com.spring.devdojo.learning_spring.controller;

import java.util.List;

import com.spring.devdojo.learning_spring.domain.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("list")
public class UserController {

    @GetMapping(path = "user")
    public List<User> list(){
        return List.of(new User("Heliezer"), new User("Iara"), new User("Giovanna"));
    }
    
}
