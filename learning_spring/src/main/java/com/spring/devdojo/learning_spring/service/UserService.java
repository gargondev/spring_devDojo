package com.spring.devdojo.learning_spring.service;

/* import java.util.ArrayList; */
import java.util.List;
/* import java.util.concurrent.ThreadLocalRandom; */

import com.spring.devdojo.learning_spring.Dto.UserPutRequestBody;
import com.spring.devdojo.learning_spring.Dto.UserRequestPostBody;
import com.spring.devdojo.learning_spring.domain.User;
import com.spring.devdojo.learning_spring.repository.UserRepository;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;

    public List<User> listAll(){
       return  userRepository.findAll();
    }

    public User findByIdOrThrowBadRequestException(long id){
        return  userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "UserNot Found"));
    }

    public User save(UserRequestPostBody userRequestPostBody){
       
        return userRepository
                .save(User.builder()
                .name(userRequestPostBody.getUser()).build());
    }

    public void delete(long id) {
       userRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(UserPutRequestBody userPutRequestBody) 
    {
        User savedUser = findByIdOrThrowBadRequestException(userPutRequestBody.getId());
        User user = User.builder()
                    .id(savedUser.getId())
                    .name(userPutRequestBody.getUser())
                    .build();

        userRepository.save(user);
    }
    
}
