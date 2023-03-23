package com.samuelhaile.emrapp.model;

import java.time.LocalDate;

public class Note {

    private int noteId;
    private int patientId;
    private String noteDetails;
    private LocalDate dateNoteAdded;

    public Note() {
    }

    public Note(int patientId, String noteDetails, LocalDate dateNoteAdded) {
        this.patientId = patientId;
        this.noteDetails = noteDetails;
        this.dateNoteAdded = dateNoteAdded;
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getNoteDetails() {
        return noteDetails;
    }

    public void setNoteDetails(String noteDetails) {
        this.noteDetails = noteDetails;
    }

    public LocalDate getDateNoteAdded() {
        return dateNoteAdded;
    }

    public void setDateNoteAdded(LocalDate dateNoteAdded) {
        this.dateNoteAdded = dateNoteAdded;
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteId=" + noteId +
                ", patientId=" + patientId +
                ", noteDetails='" + noteDetails + '\'' +
                ", dateNoteAdded=" + dateNoteAdded +
                '}';
    }
}
