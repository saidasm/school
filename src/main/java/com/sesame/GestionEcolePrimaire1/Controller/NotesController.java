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
import com.sesame.GestionEcolePrimaire1.entities.Notes;
import com.sesame.GestionEcolePrimaire1.repos.NotesRepository;


@Controller
@RequestMapping(path="/GestionEcolePrimaire1") 
public class NotesController {
  @Autowired 
  private NotesRepository notesRepository;

  @PostMapping(path="/Notes/add") 
  public @ResponseBody String addNewNotes (@RequestBody Notes notes) 
  {
   
	//Notes n = new Notes();
    //n.setNt(nt);
    
    notesRepository.save(notes);
    return "Saved";
  }

  @GetMapping(path="/Notes/all")
  public @ResponseBody Iterable<Notes> getAllNotes() {
    
    return notesRepository.findAll();
  }
  @PostMapping(path="/Notes/findbyid") 
  public @ResponseBody Optional<Notes> findbyid (@RequestBody  Notes notes) 
  {
	  var id = notes.getId();
	  var notesFinded = notesRepository.findById(id);
	  return notesFinded;
  }
  
  @PostMapping(path="/Notes/delete") 
  public @ResponseBody String deleteNotes (@RequestBody  Notes notes) 
  {
    notesRepository.delete(notes
    		);
    return "deleted";
  }
}