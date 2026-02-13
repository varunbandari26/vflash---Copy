package com.example.vflash.dto;

import java.time.LocalDateTime;
// import lombok.Data;
import lombok.Setter;
import lombok.Getter;

// @Data
@Getter
@Setter
// @SuppressWarnings("unused")
public class UserDTO {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String password;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and Setters<done using anotations>
}