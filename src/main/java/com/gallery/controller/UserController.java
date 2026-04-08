package com.gallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gallery.model.User;
import com.gallery.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins="*")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping
    public List<User> getUsers(){

        return service.getAllUsers();
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){

        service.deleteUser(id);

    }

}