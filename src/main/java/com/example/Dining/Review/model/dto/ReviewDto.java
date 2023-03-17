package com.example.Dining.Review.model.dto;
import com.example.Dining.Review.model.Review;
import com.example.Dining.Review.model.Status;
import lombok.Data;


@Data
public class ReviewDto {

    private Integer id;
    private String name;
    private Integer peanutScore;
    private Integer eggScore;
    private Integer dairyScore;
    private String commentary;
    private Status status;

    public ReviewDto(Review review) {
        this.id = review.getId();
        this.name = review.getName();
        this.peanutScore = review.getPeanutScore();
        this.eggScore = review.getEggScore();
        this.dairyScore = review.getDairyScore();
        this.commentary = review.getCommentary();
        this.status = review.getStatus();
    }

}
