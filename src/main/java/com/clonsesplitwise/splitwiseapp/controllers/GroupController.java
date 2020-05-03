package com.clonsesplitwise.splitwiseapp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.clonsesplitwise.splitwiseapp.models.Groups;
import com.clonsesplitwise.splitwiseapp.models.User;
import com.clonsesplitwise.splitwiseapp.repository.GroupRepository;
import com.clonsesplitwise.splitwiseapp.repository.UserRepository;
import com.clonsesplitwise.splitwiseapp.requestmodels.GroupRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GroupController {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    UserRepository userRepo;

    @Autowired
    GroupRepository grpRepo;

    @PostMapping("/addgroup")
    public ResponseEntity<Groups> addGroup(@RequestBody GroupRequest group) {
        // DBUtils instance = new DBUtils();
        try {
            Optional<User> createdBy = userRepo.findById(group.getCreatedBy());

            if (!createdBy.isPresent()) {
                throw new Exception("Group Created by invalid user");
            }

            List<User> groupUsers = new ArrayList<>();

            List<String> inputUserIds = group.getUsers();

            inputUserIds.forEach(userID -> {
                groupUsers.add(userRepo.findById(userID).get());
            });

            Groups _group = grpRepo.save(new Groups(group.getName(), groupUsers, createdBy.get()));
            return new ResponseEntity<>(_group, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }

    }

    @DeleteMapping("/deletegroup/{id}")
    public ResponseEntity<HttpStatus> deleteGroup(@PathVariable String id) {
        try {
            grpRepo.deleteById(id.toString());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/listgroups/{userId}")
    public ResponseEntity listGroups(@PathVariable String userId) {
        try {
            Optional<Groups> _group = grpRepo.FindGroupsByUserID(userId);
            return new ResponseEntity<>(_group, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);

        }
    }
}