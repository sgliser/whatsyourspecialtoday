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
    private String name;
    private String description;
    private float price;
    private String photoId;
    private boolean vegan;
    private boolean farmToTable;
    private boolean glutenFree;   
    private String servings;
    private String serviceSizes;
    private int caloriesPerServing; 
    private int totalFat;
    private String totalFatUnits;
    private int totalFatPercent;
    private int saturatedFat;
    private String saturatedFatUnits;
    private int saturatedFatPercent;
    private int colesterol;
    private String colesterolUnits;
    private int colesteralPercent;
    private int sodium;
    private String sodiumUnits;
    private int sodiumPercent;
    private int totalCarbs;
    private String totalCarbsUnits;
    private int totalCarbsPercent;
    private int dietaryFiber;
    private String dietaryFiberUnits;
    private int dietaryFiberPercent;
    private int totalSugars;
    private String totalSugarsUnits;
    private int totalSugarsPercent;
    private int addedSugars;
    private String addedSugarsUnits;
    private int addedSugarsPercent;
    private int protein;
    private String proteinUnits;
    private int proteinPercent;
    private int vitD;
    private String vitDUnits;
    private int vitDPercent;
    private int potassium;
    private String potassiumUnits;
    private int potassiumPercent;
    private int calcium;
    private String calciumUnits;
    private int calciumPercent;
    private int iron;
    private String ironUnits;
    private int ironPercent;
    private int vitA;
    private String vitAUnits;
    private int vitAPercent;
    private int vitC;
    private String vitCUnits;
    private int vitCPercent;
}
