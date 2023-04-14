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
import com.sesame.GestionEcolePrimaire1.entities.Matières;
import com.sesame.GestionEcolePrimaire1.repos.MatièresRepository;


@Controller
@RequestMapping(path="/GestionEcolePrimaire1") 
public class MatièresController {
  @Autowired 
  private MatièresRepository matièresRepository;

  @PostMapping(path="/Matières/add") 
  public @ResponseBody String addNewMatières (@RequestBody Matières matières) 
  {
   
	//Matières m = new Matières();
    //m.setLibellé(libellé);
    
    matièresRepository.save(matières);
    return "Saved";
  }

  @GetMapping(path="/Matières/all")
  public @ResponseBody Iterable<Matières> getAllMatières() {
    
    return matièresRepository.findAll();
  }
  @PostMapping(path="/Matières/findbyid") 
  public @ResponseBody Optional<Matières> findbyid (@RequestBody  Matières matières) 
  {
	  var id = matières.getId();
	  var matièresFinded = matièresRepository.findById(id);
	  return matièresFinded;
  }
  
  @PostMapping(path="/Matières/delete") 
  public @ResponseBody String deleteMatières (@RequestBody  Matières matières) 
  {
	  matièresRepository.delete(matières);
    return "deleted";
  }
}