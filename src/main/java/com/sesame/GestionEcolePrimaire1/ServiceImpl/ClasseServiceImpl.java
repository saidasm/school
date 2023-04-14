package com.sesame.GestionEcolePrimaire1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.GestionEcolePrimaire1.Service.ClasseService;
import com.sesame.GestionEcolePrimaire1.entities.Classe;
import com.sesame.GestionEcolePrimaire1.repos.ClasseRepository;



@Service
public class ClasseServiceImpl implements ClasseService {
@Autowired
ClasseRepository classeRepository;
@Override
public Classe saveClasse(Classe c) {
return classeRepository.save(c);
}
@Override
public Classe updateClasse(Classe c) {
return classeRepository.save(c);
}
@Override
public void deleteClasse(Classe c) {
classeRepository.delete(c);
}
 @Override
public void deleteClasseById(Long id) {
classeRepository.deleteById(id);
}
@Override
public Classe getClasse(Long id) {
return classeRepository.findById(id).get();
}
@Override
public List<Classe> getAllClasse() {
return classeRepository.findAll();
} 
}
