package com.mindtechapps.szelesdanielhazi.restaurant.view;

import com.mindtechapps.szelesdanielhazi.menuitem.view.MenuItemDTO;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Set;

@Data
public class RestaurantDTO {
    @NotNull(message = "Restaurant name is required!")
    private String name;
    private String address;
    private String phone;
    private String email;
    private Set<MenuItemDTO> menuItems;
}
