package com.wyst.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.wyst.model.MenuItem;

@RepositoryRestResource(collectionResourceRel = "menuitems", path = "menuitems")
public interface MenuItemRepository extends ListCrudRepository<MenuItem, Long>{
    

}
