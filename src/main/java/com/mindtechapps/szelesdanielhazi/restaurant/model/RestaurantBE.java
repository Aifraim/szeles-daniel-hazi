package com.mindtechapps.szelesdanielhazi.restaurant.model;

import com.mindtechapps.szelesdanielhazi.menuitem.model.MenuItemBE;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "t_restaurants")
public class RestaurantBE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<MenuItemBE> menuItems = new HashSet<>();
}
