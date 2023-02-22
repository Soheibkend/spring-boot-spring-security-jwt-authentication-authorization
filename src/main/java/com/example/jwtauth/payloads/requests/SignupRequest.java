package com.example.jwtauth.payloads.requests;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class SignupRequest {

    private String username;

    private String email;

    private Set<String> role;

    private String password;

}
