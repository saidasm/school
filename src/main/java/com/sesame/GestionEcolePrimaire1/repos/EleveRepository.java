package com.sesame.GestionEcolePrimaire1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesame.GestionEcolePrimaire1.entities.Eleve;

public interface EleveRepository extends JpaRepository<Eleve, Long> {

}
