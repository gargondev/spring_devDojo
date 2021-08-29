package com.spring.devdojo.learning_spring.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import com.spring.devdojo.learning_spring.Dto.UserPutRequestBody;
import com.spring.devdojo.learning_spring.Dto.UserRequestPostBody;
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
import org.springframework.web.bind.annotation.RequestParam;
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
    public ResponseEntity<List<User>> list(){
        log.info(dateUtil.formatDateTimeToDataBaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(userService.listAll());
    }
    

    @GetMapping(path = "/{id}")
    public ResponseEntity<User> findById(@PathVariable long id){
        return ResponseEntity.ok(userService.findByIdOrThrowBadRequestException(id));
    }

    @GetMapping(path = "/find")
    public ResponseEntity<List<User>> findByName(@RequestParam String name){
        return ResponseEntity.ok(userService.findByName(name));
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody @Valid UserRequestPostBody userRequestPostBody){
        return new ResponseEntity<>(userService.save(userRequestPostBody), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody UserPutRequestBody userPutRequestBody){
        userService.replace(userPutRequestBody);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
