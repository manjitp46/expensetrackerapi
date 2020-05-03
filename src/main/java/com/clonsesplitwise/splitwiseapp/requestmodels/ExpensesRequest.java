package com.clonsesplitwise.splitwiseapp.requestmodels;

import java.util.List;

public class ExpensesRequest {
    private String id;
    private String description;
    private List<String> paidby;
    private List<String> dividedin;

    public String getId() {
        return id;
    }

    public List<String> getDividedin() {
        return dividedin;
    }

    public void setDividedin(List<String> dividedin) {
        this.dividedin = dividedin;
    }

    public List<String> getPaidby() {
        return paidby;
    }

    public void setPaidby(List<String> paidby) {
        this.paidby = paidby;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    
}
