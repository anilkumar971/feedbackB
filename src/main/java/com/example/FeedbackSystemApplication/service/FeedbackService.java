package com.example.FeedbackSystemApplication.service;



import com.example.FeedbackSystemApplication.entity.Feedback;

import java.util.List;

public interface FeedbackService {
    Feedback submitFeedback(Feedback feedback);
    List<Feedback> getApprovedFeedback();
    List<Feedback> getAllFeedback();
    Feedback approveFeedback(Long id);
    void deleteFeedback(Long id);
}
