package com.example.vflash.service;

import com.example.vflash.model.User;
import com.example.vflash.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class Userservice {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;


    // 🔐 Register a new user
    
        public User registerUser(User user) {
            // Check if email or phone already exists
            if (userRepository.existsByEmailOrPhoneNumber(user.getEmail(), user.getPhoneNumber())) {
                throw new RuntimeException("Email or phone number already registered.");
            }

              // 🔐 Encrypt the password before saving
              String encodedPassword = passwordEncoder.encode(user.getPassword());
              user.setPassword(encodedPassword);
    
               // Set timestamps
               user.setCreatedAt(LocalDateTime.now());
               user.setUpdatedAt(LocalDateTime.now());
    
            return userRepository.save(user);
        }

    // 🔍 Fetch user by phone number
    public Optional<User> getUserByPhoneNumber(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber);
    }

    // 🔍 Fetch user by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // 🔍 Fetch user by either email or phone (optional helper)
    public Optional<User> getUserByEmailOrPhone(String emailOrPhone) {
        return userRepository.findByEmailOrPhoneNumber(emailOrPhone, emailOrPhone);
    }
}
