package com.clonsesplitwise.splitwiseapp.models;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "groups")
public class Groups {

    @Autowired
    User usr;
    
    @Id
    private String id;

    private String name;

    private List<String> users;

    private List<Expenses> expenses;

    private boolean simpleDabit = false;

    private String createdBy;

    private Date createdDate = new Date();

    public Groups() {

    }

    public Groups(String name, List<String> users, List<Expenses> expenses, 
        boolean simpleDabit, String createdBy, Date createdDate){
        this.name = name;
        this.users = users;
        this.expenses = expenses;
        this.simpleDabit = simpleDabit;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the users
     */
    public List<String> getUsers() {
        return users;
    }
    /**
     * @param users the users to set
     */
    public void setUsers(List<String> users) {
        this.users = users;
    }
    /**
     * @return the expenses
     */
    public List<Expenses> getExpenses() {
        return expenses;
    }
    /**
     * @param expenses the expenses to set
     */
    public void setExpenses(List<Expenses> expenses) {
        this.expenses = expenses;
    }

    /**
     * @param simpleDabit the simpleDabit to set
     */
    public void setSimpleDabit(boolean simpleDabit) {
        this.simpleDabit = simpleDabit;
    }
     public boolean getSimpleDabit(){
         return simpleDabit;
     }
     /**
      * @param createdBy the createdBy to set
      */
     public void setCreatedBy(String createdBy) {
         this.createdBy = createdBy;
     }
     /**
      * @return the createdBy
      */
     public String getCreatedBy() {
         return createdBy;
     }
     /**
      * @param createdDate the createdDate to set
      */
     public void setCreatedDate(Date createdDate) {
         this.createdDate = createdDate;
     }
     /**
      * @return the createdDate
      */
     public Date getCreatedDate() {
         return createdDate;
     }



}