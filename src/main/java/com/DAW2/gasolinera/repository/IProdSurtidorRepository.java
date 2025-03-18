package com.DAW2.gasolinera.repository;

import com.DAW2.gasolinera.model.ProdSurtidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProdSurtidorRepository extends JpaRepository<ProdSurtidor, Long> {

}