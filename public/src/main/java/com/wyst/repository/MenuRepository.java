package com.wyst.repository;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.wyst.model.Menu;

@RepositoryRestResource(collectionResourceRel = "menu", path = "menu")
public interface MenuRepository extends ListCrudRepository<Menu, Long>{
    
    @Override
    @RestResource(exported = false)
    void deleteById(Long id);

    @Override
    @RestResource(exported = false)
    void deleteAll();

    @Override
    @RestResource(exported = false)
    <S extends Menu> List<S> saveAll(Iterable<S> entities);

    @Override
    @RestResource(exported = false)
    <S extends Menu> S save(S entity);
}
