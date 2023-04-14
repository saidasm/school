package com.sesame.GestionEcolePrimaire1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.GestionEcolePrimaire1.Service.EmploiService;
import com.sesame.GestionEcolePrimaire1.entities.Emploi;
import com.sesame.GestionEcolePrimaire1.repos.EmploiRepository;



@Service
public class EmploiServiceImpl implements EmploiService {
@Autowired
EmploiRepository emploiRepository;
@Override
public Emploi saveEmploi(Emploi em) {
return emploiRepository.save(em);
}
@Override
public Emploi updateEmploi(Emploi em) {
return emploiRepository.save(em);
}
@Override
public void deleteEmploi(Emploi em) {
emploiRepository.delete(em);
}
 @Override
public void deleteEmploiById(Long id) {
emploiRepository.deleteById(id);
}
@Override
public Emploi getEmploi(Long id) {
return emploiRepository.findById(id).get();
}
@Override
public List<Emploi> getAllEmploi() {
return emploiRepository.findAll();
} 
}

