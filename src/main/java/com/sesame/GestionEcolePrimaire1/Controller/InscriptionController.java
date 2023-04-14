package com.sesame.GestionEcolePrimaire1.Controller;

import java.util.Date;
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
import com.sesame.GestionEcolePrimaire1.entities.Inscription;
import com.sesame.GestionEcolePrimaire1.repos.InscriptionRepository;


@Controller
@RequestMapping(path="/GestionEcolePrimaire1") 
public class InscriptionController {
  @Autowired 
  private InscriptionRepository inscriptionRepository;

  @PostMapping(path="/Inscription/add") 
  public @ResponseBody String addNewInscription (@RequestBody Inscription inscription)
  {
   
	//Inscription i = new Inscription();
    //i.setNom(nom);
   // i.setPrénom(prénom);
    //i.setClasse(classe);
   // i.setEmail(email);
   // i.setTel(tel);
    //i.setAnnée(année);
   // i.setDate_inscription(date_inscription);
    
    inscriptionRepository.save(inscription);
    return "Saved";
  }

  @GetMapping(path="/Inscription/all")
  public @ResponseBody Iterable<Inscription> getAllInscription() {
    
    return inscriptionRepository.findAll();
  }
  @PostMapping(path="/Inscription/findbyid") 
  public @ResponseBody Optional<Inscription> findbyid (@RequestBody  Inscription inscription) 
  {
	  var id = inscription.getId();
	  var inscriptionFinded = inscriptionRepository.findById(id);
	  return inscriptionFinded;
  }
  
  @PostMapping(path="/Inscription/delete") 
  public @ResponseBody String deleteInscription (@RequestBody  Inscription inscription) 
  {
	  inscriptionRepository.delete(inscription);
    return "deleted";
  }
}