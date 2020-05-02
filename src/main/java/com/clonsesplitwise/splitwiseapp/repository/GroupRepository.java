package com.clonsesplitwise.splitwiseapp.repository;

import com.clonsesplitwise.splitwiseapp.models.Groups;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Groups, String>{
    
}