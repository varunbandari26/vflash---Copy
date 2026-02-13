package com.example.vflash.mapper;

import com.example.vflash.dto.UserDTO;
import com.example.vflash.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T12:24:14+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setFullName( dto.getFullName() );
        user.setEmail( dto.getEmail() );
        user.setPhoneNumber( dto.getPhoneNumber() );
        user.setPassword( dto.getPassword() );
        user.setRole( dto.getRole() );
        user.setCreatedAt( dto.getCreatedAt() );
        user.setUpdatedAt( dto.getUpdatedAt() );

        return user;
    }

    @Override
    public UserDTO toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setFullName( user.getFullName() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setPhoneNumber( user.getPhoneNumber() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setRole( user.getRole() );
        userDTO.setCreatedAt( user.getCreatedAt() );
        userDTO.setUpdatedAt( user.getUpdatedAt() );

        return userDTO;
    }
}
