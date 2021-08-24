package com.spring.devdojo.learning_spring.controller;

import java.time.LocalDateTime;
import java.util.List;

import com.spring.devdojo.learning_spring.domain.User;
import com.spring.devdojo.learning_spring.service.UserService;
import com.spring.devdojo.learning_spring.util.DateUtil;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("users")
@Log4j2
public class UserController {

    private DateUtil dateUtil;
    private UserService userService;
    

    public UserController(DateUtil dateUtil, UserService listAllUserService) {
        this.dateUtil = dateUtil;
        this.userService = listAllUserService;
    }

  

    @GetMapping
    public List<User> list(){
        log.info(dateUtil.formatDateTimeToDataBaseStyle(LocalDateTime.now()));
        return userService.listAll();
    }
    

    @GetMapping(path = "/{id}")
    public ResponseEntity<User> findById(@PathVariable long id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user){
        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody User user){
        userService.replace(user);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
