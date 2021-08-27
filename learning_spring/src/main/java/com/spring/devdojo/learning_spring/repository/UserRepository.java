package com.spring.devdojo.learning_spring.repository;

import java.util.List;

import com.spring.devdojo.learning_spring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


    List<User> findByName(String name);
    
}
