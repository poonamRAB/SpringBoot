package com.geekster.RestaurantModel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    private Integer restaurantId;
    private String restaurantName;
    private String restaurantEmail;
    private String restaurantContact;
    private String restaurantSpeciality;
    private String restaurantAddress;
    private Integer totalStaff;

}
