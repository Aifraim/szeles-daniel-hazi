package com.mindtechapps.szelesdanielhazi.restaurant.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantBE, Long> {
    Optional<RestaurantBE> findRestaurantById(int id);
}
