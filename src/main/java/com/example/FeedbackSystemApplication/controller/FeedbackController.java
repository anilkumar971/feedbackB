package com.example.FeedbackSystemApplication.controller;



import com.example.FeedbackSystemApplication.entity.Feedback;
import com.example.FeedbackSystemApplication.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "http://localhost:4200")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping
    public Feedback submitFeedback(@RequestBody Feedback feedback) {
        return feedbackService.submitFeedback(feedback);
    }

    @GetMapping
    public List<Feedback> getApprovedFeedback() {
        return feedbackService.getApprovedFeedback();
    }
}

