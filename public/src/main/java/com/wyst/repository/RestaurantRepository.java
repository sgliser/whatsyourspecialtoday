package com.wyst.repository;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.wyst.model.Restaurant;

@RepositoryRestResource(collectionResourceRel = "restaurants", path = "restaurants")
public interface RestaurantRepository extends ListCrudRepository<Restaurant, Long> {
    
    @Override
    @RestResource(exported = false)
    void deleteById(Long id);
    
    @Override
    @RestResource(exported = false)
    void deleteAll();

    @Override
    @RestResource(exported = false)
    <S extends Restaurant> List<S> saveAll(Iterable<S> entities);

    @Override
    @RestResource(exported = false)
    <S extends Restaurant> S save(S entity);
 
}
