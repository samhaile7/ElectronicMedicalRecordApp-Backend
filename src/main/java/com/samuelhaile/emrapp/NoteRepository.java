package com.samuelhaile.emrapp;

import com.samuelhaile.emrapp.model.Note;
import com.samuelhaile.emrapp.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {

   Note findByNoteId(Long noteId);



}
