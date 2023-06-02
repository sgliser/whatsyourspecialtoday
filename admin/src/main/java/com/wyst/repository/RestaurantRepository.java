package com.wyst.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.wyst.model.Restaurant;

@RepositoryRestResource(collectionResourceRel = "restaurants", path = "restaurants")
public interface RestaurantRepository extends ListCrudRepository<Restaurant, Long> {
 
}
