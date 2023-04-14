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
import com.sesame.GestionEcolePrimaire1.repos.ClasseRepository;




	@Controller
	@RequestMapping(path="/GestionEcolePrimaire1") 
	public class ClasseController {
	  @Autowired 
	  private ClasseRepository classeRepository;

	  @PostMapping(path="/Classe/add") 
	  public @ResponseBody String addNewClasse (@RequestBody  Classe classe) 
	  {
	   
	//	Classe c = new Classe();
	   // c.setLibelle(classe.getLibelle());
	    
	    classeRepository.save(classe);
	    return "Saved";
	  }

	  @GetMapping(path="/Classe/all")
	  public @ResponseBody Iterable<Classe> getAllClasse() {
	    
	    return classeRepository.findAll();
	  }
	  
	  @PostMapping(path="/Classe/findbyid") 
	  public @ResponseBody Optional<Classe> findbyid (@RequestBody  Classe classe) 
	  {
		  var id = classe.getId();
		  var classeFinded = classeRepository.findById(id);
		  return classeFinded;
	  }
	  
	  @PostMapping(path="/Classe/delete") 
	  public @ResponseBody String deleteClasse (@RequestBody  Classe classe) 
	  {
	    classeRepository.delete(classe);
	    return "deleted";
	  }
	}

