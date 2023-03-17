package com.example.Dining.Review.model;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private Status status;
}
