package com.sesame.GestionEcolePrimaire1.Service;

import java.util.List;

import com.sesame.GestionEcolePrimaire1.entities.Eleve;

public interface EleveService {
	
	Eleve saveEleve(Eleve e);
	Eleve updateEleve(Eleve e);
	void deleteEleve(Eleve e);
	void deleteEleveById(Long id);
	Eleve getEleve(Long id);
	List<Eleve> getAllEleve();

}
