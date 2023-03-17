package com.example.Dining.Review.model.dto;

import lombok.Builder;
import lombok.Data;
import org.intellij.lang.annotations.Pattern;
import org.jetbrains.annotations.NotNull;

@Data
@Builder
public class CreateUserDto {
    @NotNull("Name can not be null")
    @Pattern("[A-Z][a-z]{1,15}+ [A-Z][a-z]{1,15}+")
    private String name;
    private String city;
    @Pattern("[0-9]+")
    private String zipcode;
    //TODO @Range(min = 1, max = 5)
    private boolean peanutAllergy;
    //TODO @Range(min = 1, max = 5)
    private boolean eggAllergy;
    //TODO @Range(min = 1, max = 5)
    private boolean dairyAllergy;
}
