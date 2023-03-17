package com.example.Dining.Review.controller;
import com.example.Dining.Review.model.User;
import com.example.Dining.Review.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    private List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/getUser/{id}")
    private User getUser(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/deleteUser/{id}")
    private void deleteUser(@PathVariable("id") int id) {
        userService.delete(id);
    }

    @PostMapping("/saveUser")
    private int saveUser(@RequestBody User user) {
        userService.save(user);
        return user.getId();
    }
}
