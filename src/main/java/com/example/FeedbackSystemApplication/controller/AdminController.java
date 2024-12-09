package com.example.FeedbackSystemApplication.controller;


import com.example.FeedbackSystemApplication.entity.Feedback;
import com.example.FeedbackSystemApplication.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/feedback")
    public List<Feedback> getAllFeedback() {
        return feedbackService.getAllFeedback();
    }

    @PutMapping("/feedback/{id}/approve")
    public Feedback approveFeedback(@PathVariable Long id) {
        return feedbackService.approveFeedback(id);
    }

    @DeleteMapping("/feedback/{id}")
    public void deleteFeedback(@PathVariable Long id) {
        feedbackService.deleteFeedback(id);
    }
}

