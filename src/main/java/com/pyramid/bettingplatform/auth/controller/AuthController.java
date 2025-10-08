package com.pyramid.bettingplatform.auth.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AuthController {
    @PostMapping("/api/auth/login")
    public Map<String,String> login(@RequestBody Map<String,String> body) {
        return Map.of("token", "fake-jwt-token", "user", body.get("username"));
    }
}
