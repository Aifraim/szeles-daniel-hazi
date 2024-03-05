package com.mindtechapps.szelesdanielhazi.menuitem.model;

import com.mindtechapps.szelesdanielhazi.restaurant.model.RestaurantBE;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "t_menuitems")
public class MenuItemBE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private String price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private RestaurantBE restaurant;
}
