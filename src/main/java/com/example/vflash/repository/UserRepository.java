package com.example.vflash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vflash.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailOrPhoneNumber(String email, String phoneNumber);

     Optional<User> findByEmail(String email);

     Optional<User> findByPhoneNumber(String phoneNumber);

     boolean existsByEmailOrPhoneNumber(String email, String phoneNumber); 
}
