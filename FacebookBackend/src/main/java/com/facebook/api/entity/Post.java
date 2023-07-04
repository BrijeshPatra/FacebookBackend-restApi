package com.facebook.api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID postID;
    private UUID userID;
    private String userName;
    private String imageURL;
    private String description;
    private String postImgURL;
    private int likes;
    private Timestamp dateTime;

    public Post(){
        super();
    }
    public Post(UUID postID, UUID userID, String userName, String imageURL, String postImgURL, int likes, Timestamp dateTime) {
        this.postID = postID;
        this.userID = userID;
        this.userName = userName;
        this.imageURL = imageURL;
        this.postImgURL = postImgURL;
        this.likes = likes;
        this.dateTime = dateTime;
    }
}
