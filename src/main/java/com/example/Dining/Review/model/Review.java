package com.example.Dining.Review.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table()
@Data
@NoArgsConstructor
public class Review {
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
    private String commentary;
    @Column
    private Status status;

}
