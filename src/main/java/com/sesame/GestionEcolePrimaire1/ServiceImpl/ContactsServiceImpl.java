package com.sesame.GestionEcolePrimaire1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.GestionEcolePrimaire1.Service.ContactsService;
import com.sesame.GestionEcolePrimaire1.entities.Contacts;
import com.sesame.GestionEcolePrimaire1.repos.ContactsRepository;



@Service
public class ContactsServiceImpl implements ContactsService {
@Autowired
ContactsRepository contactsRepository;
@Override
public Contacts saveContacts(Contacts ct) {
return contactsRepository.save(ct);
}
@Override
public Contacts updateContacts(Contacts ct) {
return contactsRepository.save(ct);
}
@Override
public void deleteContacts(Contacts ct) {
contactsRepository.delete(ct);
}
 @Override
public void deleteContactsById(Long id) {
contactsRepository.deleteById(id);
}
@Override
public Contacts getContacts(Long id) {
return contactsRepository.findById(id).get();
}
@Override
public List<Contacts> getAllContacts() {
return contactsRepository.findAll();
} 
}

