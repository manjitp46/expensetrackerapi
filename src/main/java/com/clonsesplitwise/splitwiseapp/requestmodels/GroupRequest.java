package com.clonsesplitwise.splitwiseapp.requestmodels;

import java.util.List;
import java.util.Date;

public class GroupRequest {

    private String name;

    private List<String> users;

    private boolean simpleDabit = false;

    private String createdBy;

    private Date createdDate = new Date();

    public String getName() {
        return name;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isSimpleDabit() {
        return simpleDabit;
    }

    public void setSimpleDabit(boolean simpleDabit) {
        this.simpleDabit = simpleDabit;
    }

    public void setName(String name) {
        this.name = name;
    }
}