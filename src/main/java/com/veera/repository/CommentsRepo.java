package com.veera.repository;

import com.veera.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CommentsRepo extends JpaRepository<Comments, Long> {
    List<Comments> findByTutorialId(Long postId);

    @Transactional
    void deleteByTutorialId(long tutorialId);
}