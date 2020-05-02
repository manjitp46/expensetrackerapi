package com.clonsesplitwise.splitwiseapp.models;

public class PaidBy {
    private String userid;
    private float amount;

    /**
     * @param userid the userid to set
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
    /**
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }
    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }
    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }
}