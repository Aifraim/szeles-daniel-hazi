package com.mindtechapps.szelesdanielhazi.restaurant.model;

import com.mindtechapps.szelesdanielhazi.restaurant.controller.response.ListRestaurantResponse;
import com.mindtechapps.szelesdanielhazi.restaurant.view.RestaurantDTO;
import org.mapstruct.Mapper;

@Mapper
public interface RestaurantMapper {
    RestaurantDTO entityToData(RestaurantBE entity);
    ListRestaurantResponse entityToListRestaurantResponse(RestaurantBE entity);
}
