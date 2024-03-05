package com.mindtechapps.szelesdanielhazi.restaurant.controller;

import com.mindtechapps.szelesdanielhazi.restaurant.controller.response.ListRestaurantResponse;
import com.mindtechapps.szelesdanielhazi.restaurant.view.RestaurantDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "restaurants")
public class RestaurantsController {
    private RestaurantsService service;

    public RestaurantsController(RestaurantsService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public ResponseEntity<?> search() {
        try {
            List<ListRestaurantResponse> searchEntity = service.searchAllRestaurants();
            return ResponseEntity.ok(searchEntity);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> searchById(@PathVariable int id) {
        try {
            RestaurantDTO searchEntity = service.searchRestaurantsById(id);
            return ResponseEntity.ok(searchEntity);
        } catch (BadCredentialsException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping(path = "/{id}/menu")
    public ResponseEntity<?> searchMenuById(@PathVariable int id) {
        try {
            RestaurantDTO searchEntity = service.searchRestaurantsById(id);
            return ResponseEntity.ok(searchEntity);
        } catch (BadCredentialsException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
