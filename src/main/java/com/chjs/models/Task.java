package com.chjs.models;


import javax.persistence.*;
import java.security.PrivateKey;
import java.util.Date;

@Entity
@Table(name = "tasks")
public class Task {
    private String name;
    private int id;
    private String category;
    private Date due;
    private boolean isComplete;
    private Date createdDt;
    private Date updatedDt;

    public Task() {
        this.createdDt = new Date();
        this.updatedDt = new Date();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }
    @Temporal(TemporalType.DATE)
    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public void setCategory(String category) {
        this.category = category;

    }
    @Column(name = "is_complete", columnDefinition = "BIT" , length = 1)
    public boolean getComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", insertable = true , updatable = false)
    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    public Date getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }
    @PreUpdate
    protected void updateTime(){
        this.updatedDt = new Date();
    }
}
