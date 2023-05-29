package com.samuelhaile.emrapp.controller;


import com.samuelhaile.emrapp.NoteRepository;
import com.samuelhaile.emrapp.PatientRepository;
import com.samuelhaile.emrapp.ProviderRepository;
import com.samuelhaile.emrapp.dao.NoteDao;
import com.samuelhaile.emrapp.model.Note;
import com.samuelhaile.emrapp.model.RangeCheckerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@CrossOrigin
public class NoteControllerJPA {

    @Autowired
    ProviderRepository providerRepository;
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    NoteRepository noteRepository;
    @Autowired
    RangeCheckerService rangeCheckerService;

    @RequestMapping(path = "/notes/{noteId}", method = RequestMethod.GET)
    public Note getNoteByNoteId(@PathVariable Long noteId) {
        Note note = noteRepository.findByNoteId(noteId);
        if (note == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Note Not Found");
        } else {
            return note;
        }
    }

    @RequestMapping(path = "/notes/patient/{patientId}", method = RequestMethod.GET)
    public List<Note> getNotesByPatientId(@PathVariable Long patientId) {
        List<Note> allNotes = patientRepository.findByPatientId(patientId).getPatientNotes();
        if (allNotes == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Notes Found");
        } else {
            return allNotes;
        }
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/notes", method = RequestMethod.POST)
    public Note createNote(@RequestBody @Valid Note newNote) {
        return noteRepository.save(newNote);
    }

    @RequestMapping(path = "/notes", method = RequestMethod.PUT)
    public void updateNote( @RequestBody @Valid  Note noteToUpdate) {
        if (noteRepository.findByNoteId(noteToUpdate.getNoteId()) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Note Not Found");
        }
        noteRepository.save(noteToUpdate);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path = "/notes/{noteId}", method = RequestMethod.DELETE)
    public void deleteNote( @PathVariable Long noteId) {
        if (noteRepository.findByNoteId(noteId) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Note Not Found");
        }
        noteRepository.delete(noteRepository.findByNoteId(noteId));
    }

}
