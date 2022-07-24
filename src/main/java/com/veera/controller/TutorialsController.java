package com.veera.controller;

import com.veera.entity.Tutorials;
import com.veera.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TutorialsController {

    @Autowired
    private TutorialService tutorialService;

    @PostMapping("/tutorials")
    public ResponseEntity<Tutorials> createTutorial(@RequestBody Tutorials tutorials) {
        return new ResponseEntity<>(tutorialService.createTutorial(tutorials), HttpStatus.CREATED);
    }

    @GetMapping("/tutorials")
    public ResponseEntity<List<Tutorials>> getAllTutorials()
    {
        return new ResponseEntity<List<Tutorials>>(tutorialService.getAllTutorials(), HttpStatus.OK);
    }
}