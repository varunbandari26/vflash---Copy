package com.example.vflash.model;

import jakarta.persistence.*;
// import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.*;
import lombok.Data;          //you can use this for auoto generate getters and setters
// import lombok.Getter;     // or these
// import lombok.Setter;     // two

import java.time.LocalDateTime;


@Entity
@Table(name = "users")
@Data
// @Getter
// @Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String fullName;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String email;

   
    @NotBlank(message = "Phone number is required")
    @Column(nullable = false, unique = true)
    @Pattern(regexp = "^[1-9][0-9]{9}$", message = "Phone number must be 10 digits and not start with 0")
    private String phoneNumber;
    
    @NotBlank
    @Column(nullable = false)
    private String password;

    @NotBlank
    @Column(nullable = false)
    private String role; // Admin, Customer, DeliveryPartner, etc.

    
    private LocalDateTime createdAt;
    
    private LocalDateTime updatedAt;

    // Constructors
   
    public User() {}

    // // public String getphoneNumber() {
    // //     // TODO Auto-generated method stub
    // //     throw new UnsupportedOperationException("Unimplemented method 'getphoneNumber'");
    // }   
    //    This manual way to create Getters & Setters

   
    // (You can generate these or use Lombok later) like already done above
}
