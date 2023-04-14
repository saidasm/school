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
import com.sesame.GestionEcolePrimaire1.entities.Emploi;
import com.sesame.GestionEcolePrimaire1.repos.EmploiRepository;


@Controller
@RequestMapping(path="/GestionEcolePrimaire1") 
public class EmploiController {
  @Autowired 
  private EmploiRepository emploiRepository;

  @PostMapping(path="/Emploi/add") 
  public @ResponseBody String addNewEmploi (@RequestBody Emploi emploi) 
  {
   
	//Emploi em = new Emploi();
    //em.setClasse(classe);
    
    emploiRepository.save(emploi);
    return "Saved";
  }

  @GetMapping(path="/Emploi/all")
  public @ResponseBody Iterable<Emploi> getAllEmploi() {
    
    return emploiRepository.findAll();
  }
  @PostMapping(path="/Emploi/findbyid") 
  public @ResponseBody Optional<Emploi> findbyid (@RequestBody  Emploi emploi) 
  {
	  var id = emploi.getId();
	  var emploiFinded = emploiRepository.findById(id);
	  return emploiFinded;
  }
  
  @PostMapping(path="/Emploi/delete") 
  public @ResponseBody String deleteEmploi (@RequestBody  Emploi emploi) 
  {
    emploiRepository.delete(emploi);
    return "deleted";
  }
}