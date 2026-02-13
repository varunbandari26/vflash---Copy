package com.example.vflash.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private int status;
    private String message;
    private boolean success;
    private Object data;

    // Optional: constructor without 'data' for short responses
    public ResponseDTO(String message, boolean success) {
        this.message = message;
        this.success = success;
    }
}
