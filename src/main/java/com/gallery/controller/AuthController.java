package com.gallery.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gallery.model.User;
import com.gallery.service.UserService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    UserService service;

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {

        return service.register(user);
    }

    @PostMapping("/login")
    public Optional<User> login(@RequestBody User user) {

        return service.login(user.getEmail(), user.getPassword());
    }

}