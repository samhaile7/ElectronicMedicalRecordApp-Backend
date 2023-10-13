package com.samuelhaile.emrapp.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "Note")

public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long noteId;
    @Column(nullable = false)
    private String noteDetails;
    @Column(nullable = false)
    private LocalDate dateNoteAdded;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;


    public Note() {
    }

    public Note(Long noteId, String noteDetails, LocalDate dateNoteAdded, Patient patient) {
        this.noteId = noteId;
        this.noteDetails = noteDetails;
        this.dateNoteAdded = dateNoteAdded;
        this.patient = patient;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
