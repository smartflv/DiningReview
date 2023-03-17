package com.example.Dining.Review.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table()
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column
    private String name;
    @Column
    private String city;
    @Column
    private String zipcode;
    @Column
    private boolean peanutAllergy;
    @Column
    private boolean eggAllergy;
    @Column
    private boolean dairyAllergy;

    public boolean getPeanutAllergy() {
        return this.peanutAllergy;
    }


    public boolean getEggAllergy() {
        return this.eggAllergy;
    }

    public boolean getDairyAllergy() {
        return this.dairyAllergy;
    }
}