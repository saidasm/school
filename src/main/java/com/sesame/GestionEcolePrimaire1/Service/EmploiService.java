package com.sesame.GestionEcolePrimaire1.Service;

import java.util.List;

import com.sesame.GestionEcolePrimaire1.entities.Emploi;



public interface EmploiService {
	
	Emploi saveEmploi(Emploi em);
	Emploi updateEmploi(Emploi em);
	void deleteEmploi(Emploi em);
	void deleteEmploiById(Long id);
	Emploi getEmploi(Long id);
	List<Emploi> getAllEmploi();

}
