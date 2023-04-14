package com.sesame.GestionEcolePrimaire1.Service;

import java.util.List;


import com.sesame.GestionEcolePrimaire1.entities.Matières;

public interface MatièresService {
	
	Matières saveMatières(Matières m);
	Matières updateMatières(Matières m);
	void deleteMatières(Matières m);
	void deleteMatièresById(Long id);
	Matières getMatières(Long id);
	List<Matières> getAllMatières();

}
