package com.wyst.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.wyst.model.Menu;

@RepositoryRestResource(collectionResourceRel = "menu", path = "menu")
public interface MenuRepository extends ListCrudRepository<Menu, Long>{
    
}
