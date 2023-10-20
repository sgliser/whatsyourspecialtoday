package com.wyst.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class User {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
	private String email;
	private String firstName;
	private String lastName;
}
