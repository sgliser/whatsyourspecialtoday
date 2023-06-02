package com.wyst.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MenuItem {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String restaurantID;
    private String name;
    private String description;
    private float price;
    private String photoId;
    private boolean vegan;
    private boolean farmToTable;
    private boolean glutenFree;   
    private int calories; 

}
