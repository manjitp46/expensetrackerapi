package com.clonsesplitwise.splitwiseapp.models;

import java.util.List;

public class Expenses {

    private String id;
    private String description;
    private List<PaidBy> paidby;
    private List<String> dividedin;

    public Expenses() {

    }

    public List<String> getDividedin() {
        return dividedin;
    }

    public void setDividedin(List<String> dividedin) {
        this.dividedin = dividedin;
    }

    public List<PaidBy> getPaidby() {
        return paidby;
    }

    public void setPaidby(List<PaidBy> paidby) {
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

    public Expenses(String id, String description, List<PaidBy> paidby, List<String> dividedin) {
        this.setId(id);
        this.setDescription(description);
        this.setPaidby(paidby);
        this.setDividedin(dividedin);
    }

}