package com.clonsesplitwise.splitwiseapp.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "groups")
public class Groups {
    
    @Id
    private String id;

    private String name;

    private List<String> users;

    private List<Expenses> expenses;

    public Groups() {

    }
}