package com.facebook.api.controller;
import com.facebook.api.entity.Comments;
import com.facebook.api.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;
@RestController
@RequestMapping("/api/commentService")
public class CommentController {
    @Autowired
    private CommentService commentService;
    @PostMapping("/save/{statusID}")
    public Comments submitComment(@PathVariable UUID statusID, @RequestBody Comments comments){
        return commentService.submitComment(comments,statusID);
    }
    @GetMapping("/getAllComments/{statusID}")
    public Optional<Comments> getAllCommentsByID(@PathVariable UUID statusID){
        return commentService.getAllCommentsByID(statusID);
    }
    @DeleteMapping("/delete/{commentID}")
    public void deleteComments(@PathVariable UUID commentID){
         commentService.deleteById(commentID);
    }
}
