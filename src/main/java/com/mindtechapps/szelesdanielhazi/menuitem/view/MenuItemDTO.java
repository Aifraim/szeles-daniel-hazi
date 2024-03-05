package com.mindtechapps.szelesdanielhazi.menuitem.view;

import com.mindtechapps.szelesdanielhazi.restaurant.view.RestaurantDTO;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MenuItemDTO {
    @NotNull(message = "Menu item name is required!")
    private String name;
    @NotNull(message = "Menu item price is required!")
    private String price;
    @NotNull(message = "Restaurant ID is required!")
    private RestaurantDTO restaurant;
}
