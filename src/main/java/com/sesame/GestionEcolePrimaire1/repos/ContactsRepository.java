package com.sesame.GestionEcolePrimaire1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesame.GestionEcolePrimaire1.entities.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

}
