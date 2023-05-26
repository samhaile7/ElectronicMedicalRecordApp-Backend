//package com.samuelhaile.emrapp.controller;
//
//
//import com.samuelhaile.emrapp.dao.NoteDao;
//import com.samuelhaile.emrapp.model.Note;
//import jakarta.validation.Valid;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.List;
//
//@RestController
//@CrossOrigin
//public class NoteController {
//
//    NoteDao noteDao;
//
//    public NoteController(NoteDao noteDao) {
//        this.noteDao = noteDao;
//    }
//
//    @RequestMapping(path = "/notes/{noteId}", method = RequestMethod.GET)
//    public Note getNoteByNoteId(@PathVariable int noteId) {
//        Note note = noteDao.getNoteByNoteId(noteId);
//        if (note == null) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Note Not Found");
//        } else {
//            return note;
//        }
//    }
//
//    @RequestMapping(path = "/notes/patient/{patientId}", method = RequestMethod.GET)
//    public List<Note> getNotesByPatientId(@PathVariable int patientId) {
//        List<Note> allNotes = noteDao.listAllNotesByPatientId(patientId);
//        if (allNotes == null) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Notes Found");
//        } else {
//            return allNotes;
//        }
//    }
//
//    @ResponseStatus(HttpStatus.CREATED)
//    @RequestMapping(path = "/notes", method = RequestMethod.POST)
//    public Note createNote(@RequestBody @Valid Note newNote) {
//        return noteDao.createNote(newNote);
//    }
//
//    @RequestMapping(path = "/notes", method = RequestMethod.PUT)
//    public void updateNote( @RequestBody @Valid  Note noteToUpdate) {
//        if (noteDao.getNoteByNoteId(noteToUpdate.getNoteId()) == null) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Note Not Found");
//        }
//        noteDao.updateNote(noteToUpdate);
//    }
//
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @RequestMapping(path = "/notes/{noteId}", method = RequestMethod.DELETE)
//    public void deleteNote( @PathVariable int noteId) {
//        if (noteDao.getNoteByNoteId(noteId) == null) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient Not Found");
//        }
//        noteDao.deleteNote(noteId);
//    }
//
//}
