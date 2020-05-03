package com.clonsesplitwise.splitwiseapp.models;

import java.util.List;
import java.util.UUID;

public class Expenses {

    private String id;
    private String description;
    private User paidby;
    private List<User> dividedin;
    private float amount;

    public Expenses() {

    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public List<User> getDividedin() {
        return dividedin;
    }

    public void setDividedin(List<User> dividedin) {
        this.dividedin = dividedin;
    }

    public User getPaidby() {
        return paidby;
    }

    public void setPaidby(User paidby) {
        this.paidby = paidby;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Expenses(String description, User paidby, List<User> dividedin, float amount) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
        this.paidby = paidby;
        this.dividedin = dividedin;
        this.amount = amount;
        
    }

}