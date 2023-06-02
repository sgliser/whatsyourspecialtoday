package com.wyst.repository;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.wyst.model.MenuItem;

@RepositoryRestResource(collectionResourceRel = "menuitems", path = "menuitems")
public interface MenuItemRepository extends ListCrudRepository<MenuItem, Long>{
    
    @Override
    @RestResource(exported = false)
    void deleteById(Long id);

    @Override
    @RestResource(exported = false)
    void deleteAll();

    @Override
    @RestResource(exported = false)
    <S extends MenuItem> List<S> saveAll(Iterable<S> entities);

    @Override
    @RestResource(exported = false)
    <S extends MenuItem> S save(S entity);

}
