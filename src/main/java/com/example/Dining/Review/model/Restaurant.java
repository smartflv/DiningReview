package com.example.Dining.Review.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table()
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer peanutScore;
    @Column
    private Integer eggScore;
    @Column
    private Integer dairyScore;
    @Column
    private Integer overallScore;

}
