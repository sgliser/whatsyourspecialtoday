package com.wyst.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestaurantUserMapping {
	private long userId;
	private long restaurantId;
	private boolean isOwner; //designator for finding owners quickly in the system
	private boolean createMenu;
	private boolean editMenu;
	private boolean deleteMenu;
	private boolean createMenuItem;
	private boolean editMenuItem;
	private boolean deleteMenuItem;
	private boolean createMenuItemMedia;
	private boolean editMenuItemMedia;
	private boolean deleteMenuItemMedia;
	private boolean createMenuItemNutrition;
	private boolean editMenuItemNutrition;
	private boolean deleteMenuItemNutrition;
	private boolean createCombo;
	private boolean editCombo;
	private boolean deleteCombo;
	private boolean setMenuItemPrice;
	private boolean setComboPrice;
	private boolean markMenuItemAsSpecial;
	private boolean markComboAsSpecial;
	
}
