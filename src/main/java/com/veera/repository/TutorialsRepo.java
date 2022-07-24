package com.veera.repository;

import com.veera.entity.Tutorials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialsRepo extends JpaRepository<Tutorials, Long> {
    List<Tutorials> findByPublished(boolean published);

    List<Tutorials> findByTitleContaining(String title);
}