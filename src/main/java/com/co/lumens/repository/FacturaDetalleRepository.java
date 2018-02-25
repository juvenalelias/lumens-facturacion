package com.co.lumens.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.co.lumens.entities.FacturaDetalle;

@RepositoryRestResource(collectionResourceRel = "facturaDetalle", path = "facturaDetalle")
public interface FacturaDetalleRepository extends CrudRepository<FacturaDetalle, Long>
{
	List<FacturaDetalle> findById(@Param("id") long id);
}
