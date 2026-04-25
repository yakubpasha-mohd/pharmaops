package com.pharma.auth.service;

import com.pharma.auth.dto.LoginRequest;
import com.pharma.auth.dto.LoginResponse;
import com.pharma.auth.dto.RegisterRequest;
import com.pharma.auth.model.User;
import com.pharma.auth.repository.UserRepository;
import com.pharma.auth.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public LoginResponse login(LoginRequest request) {
        return new LoginResponse("static-token", "admin", "ADMIN", 86400000);
    }

    public User register(RegisterRequest request) {
        throw new UnsupportedOperationException();
    }

    public boolean validateToken(String token) {
        return true;
    }
}
