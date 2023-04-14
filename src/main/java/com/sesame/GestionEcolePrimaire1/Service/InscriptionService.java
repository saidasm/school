package com.sesame.GestionEcolePrimaire1.Service;

import java.util.List;

import com.sesame.GestionEcolePrimaire1.entities.Inscription;



public interface InscriptionService {
	
	Inscription saveInscription(Inscription i);
	Inscription updateInscription(Inscription i);
	void deleteInscription(Inscription i);
	void deleteInscriptionById(Long id);
	Inscription getInscription(Long id);
	List<Inscription> getAllInscription();
}
