package com.example.Dining.Review.service;

import com.example.Dining.Review.model.Review;
import com.example.Dining.Review.repository.ReviewRepository;

import java.util.ArrayList;
import java.util.List;

public class ReviewService {

    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        List<Review> reviews = new ArrayList<>();
        reviewRepository.findAll().forEach(review -> reviews.add(review));
        return reviews;
    }


    public Review getReviewById(int id) {
        return reviewRepository.findById(id).get();
    }

    public void save(Review review) {
        reviewRepository.save(review);
    }

    public void delete(int id) {
        reviewRepository.deleteById(id);
    }
}
