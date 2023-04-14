package com.sesame.GestionEcolePrimaire1.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sesame.GestionEcolePrimaire1.entities.Classe;
import com.sesame.GestionEcolePrimaire1.entities.Enseignant;
import com.sesame.GestionEcolePrimaire1.repos.EnseignantRepository;


@Controller
@RequestMapping(path="/GestionEcolePrimaire1") 
public class EnseignantController {
  @Autowired 
  private EnseignantRepository enseignantRepository;

  @PostMapping(path="/Enseignant/add") 
  public @ResponseBody String addNewEnseignant (@RequestBody Enseignant enseignant)
      
  {
   
	//Enseignant es = new Enseignant();
    //es.setNom(nom);
    //es.setPrenom(prenom);
    //es.setClasse(classe);
    
    enseignantRepository.save(enseignant);
    return "Saved";
  }

  @GetMapping(path="/Enseignant/all")
  public @ResponseBody Iterable<Enseignant> getAllEnseignant() {
    
    return enseignantRepository.findAll();
  }
  @PostMapping(path="/Enseignant/findbyid") 
  public @ResponseBody Optional<Enseignant> findbyid (@RequestBody  Enseignant enseignant) 
  {
	  var id = enseignant.getId();
	  var enseignantFinded = enseignantRepository.findById(id);
	  return enseignantFinded;
  }
  
  @PostMapping(path="/Enseignant/delete") 
  public @ResponseBody String deleteEnseignant (@RequestBody  Enseignant enseignant) 
  {
	  enseignantRepository.delete(enseignant);
    return "deleted";
  }
}