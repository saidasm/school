package com.sesame.GestionEcolePrimaire1.Service;

import java.util.List;

import com.sesame.GestionEcolePrimaire1.entities.Notes;

public interface NotesService {
	
	Notes saveNotes(Notes n);
	Notes updateNotes(Notes n);
	void deleteNotes(Notes n);
	void deleteNotesById(Long id);
	Notes getNotes(Long id);
	List<Notes> getAllNotes();


}
