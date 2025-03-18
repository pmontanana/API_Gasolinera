package com.DAW2.gasolinera.repository;

import com.DAW2.gasolinera.model.Precio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPrecioRepository extends JpaRepository<Precio, Long> {

}