package com.example.Dining.Review.model.dto;
import com.example.Dining.Review.model.User;
import lombok.Data;

@Data
public class UserDto {
    private String name;
    private String city;
    private String zipcode;
    private boolean peanutAllergy;
    private boolean eggAllergy;
    private boolean dairyAllergy;

    public UserDto(User user) {
        this.name = user.getName();
        this.city = user.getCity();
        this.zipcode = user.getZipcode();
        this.peanutAllergy = user.getPeanutAllergy();
        this.eggAllergy = user.getEggAllergy();
        this.dairyAllergy = user.getDairyAllergy();
    }

}
