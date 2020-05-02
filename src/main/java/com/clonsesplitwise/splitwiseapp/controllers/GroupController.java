package com.clonsesplitwise.splitwiseapp.controllers;

import com.clonsesplitwise.splitwiseapp.models.Groups;
import com.clonsesplitwise.splitwiseapp.repository.GroupRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GroupController {
    
    @Autowired
    GroupRepository grpRepo;

    @PostMapping("/addgroup")
    public ResponseEntity<Groups> addGroup(@RequestBody Groups group) {
        
        try {
            Groups _group = grpRepo.save(new Groups(group.getName(), group.getUsers(), group.getExpenses(),
             group.getSimpleDabit(), group.getCreatedBy(), group.getCreatedDate()));
            return new ResponseEntity<>(_group, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
        
    }

    @DeleteMapping("/deletegroup/{id}")
    public ResponseEntity<HttpStatus> deleteGroup(@PathVariable String id){
        try {
             grpRepo.deleteById(id.toString());
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}