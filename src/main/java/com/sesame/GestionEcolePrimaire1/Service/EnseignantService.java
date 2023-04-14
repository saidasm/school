package com.sesame.GestionEcolePrimaire1.Service;

import java.util.List;

import com.sesame.GestionEcolePrimaire1.entities.Enseignant;



public interface EnseignantService {
	
	Enseignant saveEnseignant(Enseignant en);
	Enseignant updateEnseignant(Enseignant em);
	void deleteEnseignant(Enseignant em);
	void deleteEnseignantById(Long id);
	Enseignant getEnseignant(Long id);
	List<Enseignant> getAllEnseignant();

}
