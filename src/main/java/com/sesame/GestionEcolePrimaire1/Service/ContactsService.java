package com.sesame.GestionEcolePrimaire1.Service;

import java.util.List;


import com.sesame.GestionEcolePrimaire1.entities.Contacts;


public interface ContactsService {
	Contacts saveContacts(Contacts ct);
	Contacts updateContacts(Contacts ct);
	void deleteContacts(Contacts ct);
	void deleteContactsById(Long id);
	Contacts getContacts (Long id);
	List<Contacts> getAllContacts();
}
