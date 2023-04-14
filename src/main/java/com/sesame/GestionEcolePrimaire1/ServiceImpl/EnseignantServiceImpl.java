package com.sesame.GestionEcolePrimaire1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.GestionEcolePrimaire1.Service.EnseignantService;
import com.sesame.GestionEcolePrimaire1.entities.Enseignant;
import com.sesame.GestionEcolePrimaire1.repos.EnseignantRepository;



@Service
public class EnseignantServiceImpl implements EnseignantService {
@Autowired
EnseignantRepository enseignantRepository;
@Override
public Enseignant saveEnseignant(Enseignant es) {
return enseignantRepository.save(es);
}
@Override
public Enseignant updateEnseignant(Enseignant es) {
return enseignantRepository.save(es);
}
@Override
public void deleteEnseignant(Enseignant es) {
enseignantRepository.delete(es);
}
 @Override
public void deleteEnseignantById(Long id) {
enseignantRepository.deleteById(id);
}
@Override
public Enseignant getEnseignant(Long id) {
return enseignantRepository.findById(id).get();
}
@Override
public List<Enseignant> getAllEnseignant() {
return enseignantRepository.findAll();
} 
}

