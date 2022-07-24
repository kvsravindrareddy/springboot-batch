package com.veera.repository;

import com.veera.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepo extends JpaRepository<Tag, Long> {
    List<Tag> findTagsByTutorialsId(Long tutorialId);
}
