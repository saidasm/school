package com.sesame.GestionEcolePrimaire1;




import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sesame.GestionEcolePrimaire1.entities.Classe;
import com.sesame.GestionEcolePrimaire1.entities.Eleve;
import com.sesame.GestionEcolePrimaire1.entities.Emploi;
import com.sesame.GestionEcolePrimaire1.entities.Notes;
import com.sesame.GestionEcolePrimaire1.repos.ClasseRepository;
import com.sesame.GestionEcolePrimaire1.repos.EleveRepository;
import com.sesame.GestionEcolePrimaire1.repos.EmploiRepository;
import com.sesame.GestionEcolePrimaire1.repos.NotesRepository;

@SpringBootTest
class GestionEcolePrimaireApplicationTests {

	@Autowired
	private EleveRepository eleveRepository;
	@Test
	public void testCreateEleve() {
	Eleve eleve = new Eleve(null, "mrabet", "saida",1);
	Eleve e1 = new Eleve(null, "obey", "nesrine",1);
	Eleve e2 = new Eleve(null, "abidi", "yosra",1);
	
	
	eleveRepository.save(eleve);
	eleveRepository.save(e1);
	eleveRepository.save(e2);
	
	}

	@Autowired
	private NotesRepository noteRepository;
	@Test
	public void testCreateNotes() {
	Notes note = new Notes(null, 19.5);
	noteRepository.save(note);
	}
	
	@Autowired
	private ClasseRepository classeRepository;
	@Test
	public void testCreateClasse() {
	Classe classe = new Classe(null, "A");
	classeRepository.save(classe);
	}
	
	@Autowired
	private EmploiRepository emploiRepository;
	@Test
	public void testCreateEmploi() {
	Emploi emploi = new Emploi(null, "A");
	emploiRepository.save(emploi);
	}
}
