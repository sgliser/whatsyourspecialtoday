package com.wyst.model;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Menu {

    @Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToMany
    private Set<MenuItem> menuItems;
}
