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
import com.sesame.GestionEcolePrimaire1.entities.Eleve;
import com.sesame.GestionEcolePrimaire1.repos.EleveRepository;

@Controller
@RequestMapping(path="/GestionEcolePrimaire1") 
public class EleveController {
  @Autowired 
  private EleveRepository eleveRepository;

  @PostMapping(path="/Eleve/add") 
  public @ResponseBody String addNewEleve (@RequestBody Eleve eleve)
       
  {
   
    //Eleve e = new Eleve();
    //e.setNom(nom);
    //e.setPrenom(prenom);
    //e.setClasse(classe);
    
    eleveRepository.save(eleve);
    return "Saved";
  }

  @GetMapping(path="/Eleve/all")
  public @ResponseBody Iterable<Eleve> getAllEleve() {
    
    return eleveRepository.findAll();
  }
  
  @PostMapping(path="/Eleve/findbyid") 
  public @ResponseBody Optional<Eleve> findbyid (@RequestBody  Eleve eleve) 
  {
	  var id = eleve.getId();
	  var eleveFinded = eleveRepository.findById(id);
	  return eleveFinded;
  }
  
  @PostMapping(path="/Eleve/delete") 
  public @ResponseBody String deleteEleve (@RequestBody  Eleve eleve) 
  {
    eleveRepository.delete(eleve);
    return "deleted";
  }
}
