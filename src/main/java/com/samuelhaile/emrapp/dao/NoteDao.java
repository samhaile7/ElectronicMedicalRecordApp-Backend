package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.Note;
import com.samuelhaile.emrapp.model.Patient;

import java.util.List;

public interface NoteDao {


    List<Note> listAllNotesByPatientId(int patientId);

    Note getNoteByNoteId(int noteId);
    Note createNote(Note note);

    void deleteNote(int noteId);

    void update(Note note);
}
