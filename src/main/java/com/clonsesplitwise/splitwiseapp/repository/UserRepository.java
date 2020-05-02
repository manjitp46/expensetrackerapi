package com.clonsesplitwise.splitwiseapp.repository;

import com.clonsesplitwise.splitwiseapp.models.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository  extends MongoRepository<User, String>{
    
}