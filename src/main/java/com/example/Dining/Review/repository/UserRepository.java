package com.example.Dining.Review.repository;
import com.example.Dining.Review.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository <User, Integer> {

}
