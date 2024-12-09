package com.example.FeedbackSystemApplication.repo;


import com.example.FeedbackSystemApplication.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findByApproved(boolean approved);
}

