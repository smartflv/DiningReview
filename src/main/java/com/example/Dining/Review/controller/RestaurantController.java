package com.example.Dining.Review.controller;
import com.example.Dining.Review.model.Restaurant;
import com.example.Dining.Review.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/restaurant")
public class RestaurantController extends Restaurant {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/allRestaurants")
    private List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/getRestaurant/{id}")
    private Restaurant getRestaurant(@PathVariable("id") int id) {
        return restaurantService.getRestaurantById(id);
    }

    @DeleteMapping("/deleteRestaurant/{id}")
    private void deleteRestaurant(@PathVariable("id") int id) {
        restaurantService.delete(id);
    }
    @PostMapping("/saveRestaurant")
    private int saveRestaurant(@RequestBody Restaurant restaurant) {
        restaurantService.save(restaurant);
        return restaurant.getId();
    }

}
