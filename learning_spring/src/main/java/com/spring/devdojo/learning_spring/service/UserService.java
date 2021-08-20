package com.spring.devdojo.learning_spring.service;

import java.util.List;

import com.spring.devdojo.learning_spring.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    public List<User> listAll(){
       return  List.of(new User(1L, "Carlos Fernando"), new User(2L, "Iara Aparecida"), new User(3L, "Giovanna"));
    }
    
}
