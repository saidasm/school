package com.sesame.GestionEcolePrimaire1.Service;

import java.util.List;

import com.sesame.GestionEcolePrimaire1.entities.Classe;


public interface ClasseService {
	
	Classe saveClasse(Classe c);
	Classe updateClasse(Classe c);
	void deleteClasse(Classe c);
	void deleteClasseById(Long id);
	Classe getClasse (Long id);
	List<Classe> getAllClasse();

}
