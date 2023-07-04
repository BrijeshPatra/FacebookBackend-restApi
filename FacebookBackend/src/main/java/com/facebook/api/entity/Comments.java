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
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID postID;
    private UUID commentID;
    private UUID userID;
    private String comment;
    private Timestamp dateTime;

    public Comments(){
        super();
    }
    public Comments(UUID postID, UUID commentID, UUID userID, String comment, Timestamp dateTime) {
        this.postID = postID;
        this.commentID = commentID;
        this.userID = userID;
        this.comment = comment;
        this.dateTime = dateTime;
    }
}
