package com.example.Dining.Review.model.dto;
import com.example.Dining.Review.model.Restaurant;
import lombok.Data;


@Data
public class RestaurantDto {
    private Integer id;
    private String name;
    private Integer peanutScore;
    private Integer eggScore;
    private Integer dairyScore;
    private Integer overallScore;

    public  RestaurantDto(Restaurant restaurant) {
        this.name= restaurant.getName();
        this.peanutScore = restaurant.getPeanutScore();
        this.eggScore = restaurant.getEggScore();
        this.dairyScore = restaurant.getDairyScore();
        this.overallScore = restaurant.getOverallScore();

    }

}
