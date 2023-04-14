package com.sesame.GestionEcolePrimaire1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.GestionEcolePrimaire1.Service.InscriptionService;
import com.sesame.GestionEcolePrimaire1.entities.Inscription;
import com.sesame.GestionEcolePrimaire1.repos.InscriptionRepository;



@Service
public class InscriptionServiceImpl implements InscriptionService {
@Autowired
InscriptionRepository inscriptionRepository;
@Override
public Inscription saveInscription(Inscription i) {
return inscriptionRepository.save(i);
}
@Override
public Inscription updateInscription(Inscription i) {
return inscriptionRepository.save(i);
}
@Override
public void deleteInscription(Inscription i) {
inscriptionRepository.delete(i);
}
 @Override
public void deleteInscriptionById(Long id) {
inscriptionRepository.deleteById(id);
}
@Override
public Inscription getInscription(Long id) {
return inscriptionRepository.findById(id).get();
}
@Override
public List<Inscription> getAllInscription() {
return inscriptionRepository.findAll();
} 
}

