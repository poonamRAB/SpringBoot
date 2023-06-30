package com.geekster.RestaurantModel.controller;


import com.geekster.RestaurantModel.model.Restaurant;
import com.geekster.RestaurantModel.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    //read
    @GetMapping("restaurants")
    List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

//    @GetMapping("restaurant/{restaurantId}")
//    String getRestaurant(@PathVariable Integer restaurantId){
//        return restaurantService.createRestaurant(restaurantId);
//    }

    //create
    @PostMapping("restaurants")
    String addRestaurants(@PathVariable List<Restaurant> restaurants){
        return restaurantService.createRestaurants(restaurants);
    }

//    @PostMapping("restaurant")
//    String createRestaurant( @PathVariable Restaurant restaurant){
//        return restaurantService.createRestaurant(restaurant);
//    }


    //delete
    @DeleteMapping("restaurant")
    String removeRestaurant(@PathVariable Integer restaurantId){
        return restaurantService.removeRestaurant(restaurantId);
    }

    //update
    @RequestMapping("restaurant/{restaurantId}/email/{restaurantEmail}")
    String updateEmail(@PathVariable Integer restaurantId, @PathVariable String restaurantEmail){
        return restaurantService.updateEmail(restaurantId,restaurantEmail);
    }


}
