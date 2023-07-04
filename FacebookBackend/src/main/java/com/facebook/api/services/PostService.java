package com.facebook.api.services;

import com.facebook.api.entity.Post;
import com.facebook.api.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public List<Post> submitPost(Post post) {
        Date date=new Date();
        long time= date.getTime();
        Timestamp dateTime=new Timestamp(time);
        
        post.setPostID(UUID.randomUUID());
        post.setLikes(0);
        post.setDateTime(dateTime);
        postRepository.save(post);
        return retrieveAllPost();
    }

    public List<Post> retrieveAllPost() {
     return postRepository.findAll();
    }


    public void deletePost(UUID postID) {
        postRepository.deleteById(postID);
    }
}
