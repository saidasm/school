package com.sesame.GestionEcolePrimaire1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesame.GestionEcolePrimaire1.entities.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {

}
