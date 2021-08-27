package com.spring.devdojo.learning_spring.mapper;

import com.spring.devdojo.learning_spring.Dto.UserPutRequestBody;
import com.spring.devdojo.learning_spring.Dto.UserRequestPostBody;
import com.spring.devdojo.learning_spring.domain.User;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    public abstract User toUser(UserRequestPostBody userRequestPostBody);

    public abstract User toUser(UserPutRequestBody userPutRequestBody);

    
    
}
