package org.sid.dao;

import java.awt.print.Pageable;

import org.sid.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
	@Query("select p from Produit p where p.designation like :x")
	public Page<Produit> chercher(@Param("x")String mc,org.springframework.data.domain.Pageable pageable);

	public String delete(Long id);

	//public String delete(Long id);

}
