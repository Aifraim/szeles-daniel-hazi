package com.mindtechapps.szelesdanielhazi.menuitem.model;

import com.mindtechapps.szelesdanielhazi.menuitem.view.MenuItemDTO;
import com.mindtechapps.szelesdanielhazi.restaurant.model.RestaurantMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MenuItemMapper {

    MenuItemDTO entityToData(MenuItemBE entity);
}
