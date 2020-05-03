package com.clonsesplitwise.splitwiseapp.repository;

import java.util.Optional;

import com.clonsesplitwise.splitwiseapp.models.Groups;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends MongoRepository<Groups, String> {
    // List<Groups> findGroupsForUser(String userId);
    @org.springframework.data.mongodb.repository.Query(value = "{ 'users._id': ?0}")
    Optional<Groups> FindGroupsByUserID(String id);
}