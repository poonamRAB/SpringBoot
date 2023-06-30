package com.geekster.RestaurantModel.repository;

import com.geekster.RestaurantModel.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantRepo {

    @Autowired
   private  List<Restaurant> restaurantList;

    public List<Restaurant> getRestaurants(){
        return restaurantList;
    }
}
