package com.clonsesplitwise.splitwiseapp.utils;

import java.util.Optional;


import com.clonsesplitwise.splitwiseapp.models.User;
import com.clonsesplitwise.splitwiseapp.repository.GroupRepository;
import com.clonsesplitwise.splitwiseapp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class DBUtils {

    
   private static UserRepository userRepo;
   @Autowired
   public DBUtils(UserRepository userRepo){
    DBUtils.userRepo=userRepo;
   }

    @Autowired
    GroupRepository groupRepo;


    public DBUtils() {

    }

    public static  boolean isUserExists(String userId) {
        try {
            Optional<User> _user = userRepo.findById(userId);
            if (_user.isPresent()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}