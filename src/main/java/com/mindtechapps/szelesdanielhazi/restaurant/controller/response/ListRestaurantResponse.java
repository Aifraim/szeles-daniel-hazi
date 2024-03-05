package com.mindtechapps.szelesdanielhazi.restaurant.controller.response;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ListRestaurantResponse {
    @NotNull(message = "Restaurant name is required!")
    private String name;
    private String address;
    private String phone;
    private String email;
}
