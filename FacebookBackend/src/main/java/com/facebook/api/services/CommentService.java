package com.facebook.api.services;

import com.facebook.api.entity.Comments;
import com.facebook.api.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    public Comments submitComment(Comments comments, UUID statusID) {
        Date date=new Date();
        long time=date.getTime();
        Timestamp dateTime=new Timestamp(time);
        comments.setCommentID(UUID.randomUUID());
        comments.setDateTime(dateTime);
        return commentRepository.save(comments);
    }

    public Optional<Comments> getAllCommentsByID(UUID statusID) {
        return commentRepository.findById(statusID);
    }

    public void deleteById(UUID commentID) {
        commentRepository.deleteById(commentID);
    }
}
