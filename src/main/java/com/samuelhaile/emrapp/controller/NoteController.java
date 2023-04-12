package com.samuelhaile.emrapp.controller;


import com.samuelhaile.emrapp.dao.NoteDao;
import com.samuelhaile.emrapp.model.Note;
import com.samuelhaile.emrapp.model.Patient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class NoteController {

    NoteDao noteDao;

    public NoteController(NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    @RequestMapping(path = "/notes/{noteId}", method = RequestMethod.GET)
    public Note getNoteByNoteId(@PathVariable int noteId) {
        Note note = noteDao.getNoteByNoteId(noteId);
        if (note == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient Not Found");
        } else {
            return note;
        }
    }

}
