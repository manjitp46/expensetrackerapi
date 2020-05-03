package com.clonsesplitwise.splitwiseapp.requestmodels;

import java.util.List;

public class ExpensesRequest {
    private String description;
    private String paidby;
    private List<String> dividedin;
    private float amount;

    public List<String> getDividedin() {
        return dividedin;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setDividedin(List<String> dividedin) {
        this.dividedin = dividedin;
    }

    public String getPaidby() {
        return paidby;
    }

    public void setPaidby(String paidby) {
        this.paidby = paidby;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
