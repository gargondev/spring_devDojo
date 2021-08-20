package com.spring.devdojo.learning_spring.controller;

import java.time.LocalDateTime;
import java.util.List;

import com.spring.devdojo.learning_spring.domain.User;
import com.spring.devdojo.learning_spring.util.DateUtil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("list")
@Log4j2
public class UserController {

    private DateUtil dateUtil;

    public UserController(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }

  

    @GetMapping(path = "user")
    public List<User> list(){
        log.info(dateUtil.formatDateTimeToDataBaseStyle(LocalDateTime.now()));
        return List.of(new User("Heliezer"), new User("Iara"), new User("Giovanna"));
    }
    
}
