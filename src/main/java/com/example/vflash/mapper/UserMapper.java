package com.example.vflash.mapper;

import com.example.vflash.dto.UserDTO;
import com.example.vflash.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    @Mappings({
        @Mapping(source = "fullName", target = "fullName"),
        @Mapping(source = "email", target = "email"),
        @Mapping(source = "phoneNumber", target = "phoneNumber"),
        @Mapping(source = "password", target = "password"),
        @Mapping(source = "role", target = "role")
        // We ignore id, createdAt, updatedAt (handled automatically elsewhere)
    })
    User toEntity(UserDTO dto);

    @Mappings({
        @Mapping(source = "fullName", target = "fullName"),
        @Mapping(source = "email", target = "email"),
        @Mapping(source = "phoneNumber", target = "phoneNumber"),
        @Mapping(source = "password", target = "password"),
        @Mapping(source = "role", target = "role")
    })
    UserDTO toDto(User user);
}
