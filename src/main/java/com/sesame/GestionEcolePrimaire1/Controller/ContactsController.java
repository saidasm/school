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
import com.sesame.GestionEcolePrimaire1.entities.Contacts;
import com.sesame.GestionEcolePrimaire1.repos.ContactsRepository;




@Controller
@RequestMapping(path="/GestionEcolePrimaire1") 
public class ContactsController {
  @Autowired 
  private ContactsRepository contactsRepository;

  @PostMapping(path="/add") 
  public @ResponseBody String addNewContacts (@RequestBody Contacts contacts)
     
  {
   
	//Contacts ct = new Contacts();
   // ct.setNom(nom);
    //ct.setPrénom(prénom);
   // ct.setEmail(email);
   // ct.setTel(tel);
   // ct.setMessage(message);
    
    
    contactsRepository.save(contacts);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Contacts> getAllContacts() {
    
    return contactsRepository.findAll();
  }
  
  @PostMapping(path="/Contacts/findbyid") 
  public @ResponseBody Optional<Contacts> findbyid (@RequestBody  Contacts contacts) 
  {
	  var id = contacts.getId();
	  var contactsFinded = contactsRepository.findById(id);
	  return contactsFinded;
  }
  
  @PostMapping(path="/Contacts/delete") 
  public @ResponseBody String deleteContacts (@RequestBody  Contacts contacts) 
  {
    contactsRepository.delete(contacts);
    return "deleted";
  }
}