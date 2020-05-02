package com.clonsesplitwise.splitwiseapp.controllers;

import com.clonsesplitwise.splitwiseapp.models.User;
import com.clonsesplitwise.splitwiseapp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
public class UsersController {
    @Autowired
    UserRepository userRepo;

    @PostMapping(value="/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        try {
            User _user = userRepo.save(new User(user.getName(), user.getEmail()));
            return new ResponseEntity<>(_user, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
    
}