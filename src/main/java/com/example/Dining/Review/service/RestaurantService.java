package com.example.Dining.Review.service;

import com.example.Dining.Review.model.Restaurant;
import com.example.Dining.Review.repository.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;

public class RestaurantService {

    private RestaurantRepository restaurantRepository;

    public List<Restaurant> getAllRestaurants() {
        List<Restaurant> restaurants = new ArrayList<>();
        restaurantRepository.findAll().forEach(restaurant -> restaurants.add(restaurant));
        return restaurants;
    }

    public Restaurant getRestaurantById(int id) {
        return restaurantRepository.findById(id).get();
    }

    public void delete(int id) {
        restaurantRepository.deleteById(id);
    }

    public void save(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }
}
