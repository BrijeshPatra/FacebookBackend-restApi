package com.facebook.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID statusID;
    private UUID userID;
    private String statusImageURL;
    private Timestamp uploadTime;

    public Status(){
        super();
    }
    public Status(UUID statusID, UUID userID, String statusImageURL, Timestamp uploadTime) {
        this.statusID = statusID;
        this.userID = userID;
        this.statusImageURL = statusImageURL;
        this.uploadTime = uploadTime;
    }
}
