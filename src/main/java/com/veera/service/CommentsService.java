package com.veera.service;

import com.veera.entity.Comments;
import com.veera.repository.CommentsRepo;
import com.veera.repository.TutorialsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {
    @Autowired
    private CommentsRepo commentsRepo;
    @Autowired
    private TutorialsRepo tutorialsRepo;

    public Comments createComment(Long tutorialId, final Comments comments) throws Exception {
        Comments resultComments = tutorialsRepo.findById(tutorialId).map(tutorial -> {
            comments.setTutorial(tutorial);
            return commentsRepo.save(comments);
        }).orElseThrow(()-> new Exception("Unable to create it"));
        return resultComments;
    }
}