package com.sesame.GestionEcolePrimaire1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.GestionEcolePrimaire1.Service.EleveService;
import com.sesame.GestionEcolePrimaire1.entities.Eleve;
import com.sesame.GestionEcolePrimaire1.repos.EleveRepository;

@Service
public class EleveServiceImpl implements EleveService {
@Autowired
EleveRepository eleveRepository;
@Override
public Eleve saveEleve(Eleve e) {
return eleveRepository.save(e);
}
@Override
public Eleve updateEleve(Eleve e) {
return eleveRepository.save(e);
}
@Override
public void deleteEleve(Eleve e) {
eleveRepository.delete(e);
}
 @Override
public void deleteEleveById(Long id) {
eleveRepository.deleteById(id);
}
@Override
public Eleve getEleve(Long id) {
return eleveRepository.findById(id).get();
}
@Override
public List<Eleve> getAllEleve() {
return eleveRepository.findAll();
} 
}
