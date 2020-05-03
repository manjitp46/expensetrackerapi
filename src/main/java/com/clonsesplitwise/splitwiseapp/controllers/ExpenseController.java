package com.clonsesplitwise.splitwiseapp.controllers;

import java.util.Optional;

import com.clonsesplitwise.splitwiseapp.models.Expenses;
import com.clonsesplitwise.splitwiseapp.models.Groups;
import com.clonsesplitwise.splitwiseapp.repository.GroupRepository;
import com.clonsesplitwise.splitwiseapp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class ExpenseController {
    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    UserRepository userRepo;

    @Autowired
    GroupRepository grpRepo;

    @PostMapping("/addexpense/{groupID}")
    public ResponseEntity addExpense(@PathVariable String groupID) {
        try {
            Groups _groupToUpdate = grpRepo.findById(groupID).get();
            _groupToUpdate.setName("RandomName");
            Groups _group = grpRepo.save(_groupToUpdate);
            return new ResponseEntity<>(_group, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    
}