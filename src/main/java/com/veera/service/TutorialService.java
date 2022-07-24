package com.veera.service;

import com.veera.entity.Tutorials;
import com.veera.repository.TutorialsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialService {
    @Autowired
    private TutorialsRepo tutorialsRepo;

    public Tutorials createTutorial(Tutorials tutorials) {
        return tutorialsRepo.save(tutorials);
    }

    public List<Tutorials> getAllTutorials() {
        return tutorialsRepo.findAll();
    }
}