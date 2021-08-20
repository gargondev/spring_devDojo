package com.spring.devdojo.learning_spring.service;

import java.util.List;

import com.spring.devdojo.learning_spring.domain.User;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {


    private List<User> users = List.of(new User(1L, "Carlos Fernando"), new User(2L, "Iara Aparecida"), new User(3L, "Giovanna"));

    public List<User> listAll(){
       return  users;
    }

    public User findById(long id){
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "UserNot Found"));
    }
    
}
