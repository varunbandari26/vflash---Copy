package com.example.vflash.controller;

import com.example.vflash.model.User;
import com.example.vflash.service.Userservice;

import jakarta.validation.Valid;

// import com.example.vflash.dto.ApiResponse;
import com.example.vflash.dto.ResponseDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/users", produces = "application/json")
public class UserController {
     // Expose endpoints like /register, /verify-otp

     @Autowired
     private Userservice userservice;

     @PostMapping("/register")
     public ResponseEntity<ResponseDTO> registerUser(@Valid @RequestBody User user) {
         try {
             User savedUser = userservice.registerUser(user);
             return ResponseEntity.ok(new ResponseDTO(200, "User registered successfully", true, savedUser));
         } catch (Exception e) {
             return ResponseEntity.status(500).body(new ResponseDTO(500, "Registration failed", false, null));
         }
     }
}
