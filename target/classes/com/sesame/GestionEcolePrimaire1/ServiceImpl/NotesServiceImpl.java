package com.sesame.GestionEcolePrimaire1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.GestionEcolePrimaire1.Service.NotesService;
import com.sesame.GestionEcolePrimaire1.entities.Notes;
import com.sesame.GestionEcolePrimaire1.repos.NotesRepository;



@Service
public class NotesServiceImpl implements NotesService {
@Autowired
NotesRepository notesRepository;
@Override
public Notes saveNotes(Notes n) {
return notesRepository.save(n);
}
@Override
public Notes updateNotes(Notes n) {
return notesRepository.save(n);
}
@Override
public void deleteNotes(Notes n) {
notesRepository.delete(n);
}
 @Override
public void deleteNotesById(Long id) {
notesRepository.deleteById(id);
}
@Override
public Notes getNotes(Long id) {
return notesRepository.findById(id).get();
}
@Override
public List<Notes> getAllNotes() {
return notesRepository.findAll();
} 
}

