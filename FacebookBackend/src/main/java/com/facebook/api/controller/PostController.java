package com.facebook.api.controller;

import com.facebook.api.entity.Post;
import com.facebook.api.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/postService")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping("/save")
    public List<Post> submitPost(@RequestBody Post post){
        List<Post> result= postService.submitPost(post);
        return result;
    }
    @GetMapping("/getPost")
    public List<Post> retrieveAllPost(){
        List<Post> result= postService.retrieveAllPost();
        return result;
    }
    @DeleteMapping("/delete/{postID}")
    public void deletePost(@PathVariable ("postId") UUID postID){
        postService.deletePost(postID);
    }

}
