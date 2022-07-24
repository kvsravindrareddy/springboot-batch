package com.veera.controller;

import com.veera.entity.Comments;
import com.veera.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @PostMapping("/tutorials/{tutorialId}/comments")
    public ResponseEntity<Comments> createComment(@PathVariable(value = "tutorialId") Long tutorialId,
                                                  @RequestBody Comments commentRequest) throws Exception {

        return new ResponseEntity<>(commentsService.createComment(tutorialId, commentRequest), HttpStatus.CREATED);
    }

}