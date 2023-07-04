package com.facebook.api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userID;
    private String userName;
    private String userImageURL;
    private boolean activityStatus;
    private Timestamp joiningDate;
    public Users(){

    }
    public Users(UUID userID, String userName, String userImageURL, Boolean activityStatus) {
        this.userID = userID;
        this.userName = userName;
        this.userImageURL = userImageURL;
        this.activityStatus = activityStatus;
    }
}
