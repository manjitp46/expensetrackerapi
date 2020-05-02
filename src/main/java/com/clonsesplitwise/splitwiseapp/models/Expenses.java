package com.clonsesplitwise.splitwiseapp.models;

import java.util.List;

public class Expenses {

    private String id;
    private String description;
    private List<PaidBy> paidby;
    private List<String> dividedin;

    public Expenses() {

    }

    public Expenses(String id, String description, List<PaidBy> paidby, List<String> dividedin) {
        this.id = id;
        this.description = description;
        this.paidby = paidby;
        this.dividedin = dividedin;
    }

}