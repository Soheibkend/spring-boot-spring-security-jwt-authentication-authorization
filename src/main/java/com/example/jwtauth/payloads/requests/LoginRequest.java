package com.example.jwtauth.payloads.requests;

import jakarta.annotation.Nonnull;
import lombok.Data;
import lombok.NonNull;

@Data
public class LoginRequest {

    private String password;

    private String username;
}
