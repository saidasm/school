package com.sesame.GestionEcolePrimaire1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity
public class Eleve {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	  private Long id;
	  private String nom;
	  private String prenom;
	  private String classe;
	  		
		
}

