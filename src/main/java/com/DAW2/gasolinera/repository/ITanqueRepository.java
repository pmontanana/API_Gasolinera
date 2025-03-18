package com.DAW2.gasolinera.repository;

import com.DAW2.gasolinera.model.Tanque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITanqueRepository extends JpaRepository<Tanque, Long> {

}