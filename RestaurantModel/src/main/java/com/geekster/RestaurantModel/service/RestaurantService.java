package com.geekster.RestaurantModel.service;


import com.geekster.RestaurantModel.model.Restaurant;
import com.geekster.RestaurantModel.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> getAllRestaurants(){
        return restaurantRepo.getRestaurants();
    }

    //updating restaurant Information like emailId
    public String updateEmail(Integer restaurantId, String restaurantEmail){
        List<Restaurant> list = getAllRestaurants();
        for(Restaurant r : list){
            if(restaurantId.equals(r.getRestaurantId())){
                r.setRestaurantEmail(restaurantEmail);

                return "Email Id successfully updated!!!";
            }
        }

        return "This Id not found!!!";
    }

    //adding restaurant
    public String createRestaurant(Restaurant restaurant){
        List<Restaurant> list = getAllRestaurants();
        list.add(restaurant);
        return "new restaurant is added in to the list!!";
    }

    //creating/adding new restaurants more than one at same time in list

    public String createRestaurants(List<Restaurant> restaurants){
        List<Restaurant> list = getAllRestaurants();
        list.addAll(restaurants);
        return "new restaurants added in to the list!!";
    }

    //removing restaurant from the list
    public String removeRestaurant(Integer restaurantId){
        List<Restaurant> list = getAllRestaurants();
        for(Restaurant r : list){
            if(restaurantId.equals(r.getRestaurantId())){
                list.remove(r);
                return "restaurant is removed!!!";
            }
        }
        return "This Id not found!!!";
    }



}
