package com.mindtechapps.szelesdanielhazi.menuitem.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItemBE, Long> {
    Optional<MenuItemBE> findMenuByRestaurantId(int id);
}
