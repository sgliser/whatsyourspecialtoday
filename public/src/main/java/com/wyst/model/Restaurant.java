package com.wyst.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Restaurant {

    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String tagline;
    private String cuisine;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private float latitude;
    private float longitude;
    private double distance;
    private String googleMapsLink;
    private String appleMapsLink;
    private boolean farmToTable;
    private boolean vegan;
    private boolean glutenFree;
    private boolean dineIn;
    private boolean driveThrough;
    private boolean delivery;
    private boolean familyRun;
    private boolean chain;
    private String priceInidcator;
    private float rating;
    
}
