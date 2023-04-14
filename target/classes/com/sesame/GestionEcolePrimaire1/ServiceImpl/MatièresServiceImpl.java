package com.sesame.GestionEcolePrimaire1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.GestionEcolePrimaire1.Service.MatièresService;
import com.sesame.GestionEcolePrimaire1.entities.Matières;
import com.sesame.GestionEcolePrimaire1.repos.MatièresRepository;


@Service
public class MatièresServiceImpl implements MatièresService {
@Autowired
MatièresRepository matièresRepository;
@Override
public Matières saveMatières(Matières m) {
return matièresRepository.save(m);
}
@Override
public Matières updateMatières(Matières m) {
return matièresRepository.save(m);
}
@Override
public void deleteMatières(Matières m) {
matièresRepository.delete(m);
}
 @Override
public void deleteMatièresById(Long id) {
matièresRepository.deleteById(id);
}
@Override
public Matières getMatières(Long id) {
return matièresRepository.findById(id).get();
}
@Override
public List<Matières> getAllMatières() {
return matièresRepository.findAll();
} 
}

