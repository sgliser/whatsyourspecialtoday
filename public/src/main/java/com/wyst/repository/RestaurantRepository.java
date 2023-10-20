package com.wyst.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
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
    //@RestResource(exported = false)
    <S extends Restaurant> S save(S entity);
    
    @Query("SELECT r FROM Restaurant r " +
            "WHERE (6371 * acos(cos(radians(:givenLatitude)) * cos(radians(r.latitude)) * cos(radians(r.longitude) " +
            "- radians(:givenLongitude)) + sin(radians(:givenLatitude)) * sin(radians(r.latitude)))) <= 5")
    List<Restaurant> findRestaurantsWithinFiveMiles(
            @Param("givenLatitude") float givenLatitude,
            @Param("givenLongitude") float givenLongitude
    ); 
}
