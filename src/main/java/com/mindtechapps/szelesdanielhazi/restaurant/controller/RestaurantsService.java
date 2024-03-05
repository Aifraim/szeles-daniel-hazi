package com.mindtechapps.szelesdanielhazi.restaurant.controller;

import com.mindtechapps.szelesdanielhazi.restaurant.controller.response.ListRestaurantResponse;
import com.mindtechapps.szelesdanielhazi.restaurant.model.RestaurantBE;
import com.mindtechapps.szelesdanielhazi.restaurant.model.RestaurantMapper;
import com.mindtechapps.szelesdanielhazi.restaurant.model.RestaurantRepository;
import com.mindtechapps.szelesdanielhazi.restaurant.view.RestaurantDTO;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;
import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RestaurantsService {
    private final RestaurantMapper mapper;
    private final RestaurantRepository repository;

    public RestaurantsService(RestaurantMapper mapper, RestaurantRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public List<ListRestaurantResponse> searchAllRestaurants(){
        List<RestaurantBE> restaurants = repository.findAll();
        return restaurants.stream().map(mapper::entityToListRestaurantResponse).collect(Collectors.toList());
    }

    public RestaurantDTO searchRestaurantsById(int id){
        RestaurantBE restaurant = repository.findRestaurantById(id)
                .orElseThrow(() -> new BadCredentialsException("Invalid restaurant ID"));;
        return mapper.entityToData(restaurant);
    }


}
