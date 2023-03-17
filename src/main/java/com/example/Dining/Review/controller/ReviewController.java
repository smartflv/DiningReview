package com.example.Dining.Review.controller;

import com.example.Dining.Review.model.Review;
import com.example.Dining.Review.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/review")
public class ReviewController extends Review {
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/allReviews")
    private List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/getReview/{id}")
    private Review getReviewById(@PathVariable("id") int id) {
        return reviewService.getReviewById(id);
    }

    @PostMapping("/saveReview")
    private int saveReview(@RequestBody Review review) {
        reviewService.save(review);
        return review.getId();
    }

    @DeleteMapping("/deleteReview/{id}")
    private void deleteReview(@PathVariable("id") int id) {
        reviewService.delete(id);
    }

}
