package com.gallery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gallery.model.User;
import com.gallery.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    public User register(User user) {

        if(user.getRole() == null)
            user.setRole("USER");

        return repo.save(user);
    }

    public Optional<User> login(String email, String password) {

        Optional<User> user = repo.findByEmail(email);

        if(user.isPresent() && user.get().getPassword().equals(password))
            return user;

        return Optional.empty();
    }

    public List<User> getAllUsers() {

        return repo.findAll();
    }
    public void deleteUser(Long id){

        repo.deleteById(id);

    }

}