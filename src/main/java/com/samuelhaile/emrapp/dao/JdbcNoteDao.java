package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.Note;
import com.samuelhaile.emrapp.model.Patient;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class JdbcNoteDao implements NoteDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcNoteDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Note> listAllNotesByPatientId(int patientId) {
            List<Note> allNotesForPatient = new ArrayList<>();
            String sql =
                    "SELECT note_id, patient_id, note_details, date_added  " +
                            "                        FROM patient_note " +
                            "                        WHERE patient_id = ?; ";
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, patientId);

            while (results.next()) {
                allNotesForPatient.add(mapRowToNote(results));
            }
            return allNotesForPatient;
        }

    @Override
    public Note getNoteByNoteId(int noteId) {
        Note note = null;
        String sql =
                "SELECT note_id, patient_id, note_details, date_added  " +
                        "                        FROM patient_note " +
                        "                        WHERE note_id = ?; ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, noteId);

        if (results.next()) {
            note = mapRowToNote(results);
        }
        return note;
    }

    @Override
    public Note createNote(Note note) {
        return null;
    }

    @Override
    public void deleteNote(int noteId) {

    }

    @Override
    public void update(Note note) {

    }

    private Note mapRowToNote(SqlRowSet row) {
        Note note = new Note();
        note.setNoteId(row.getInt("note_id"));
        note.setPatientId(row.getInt("patient_id"));
        note.setNoteDetails(row.getString("note_details"));
        note.setDateNoteAdded(row.getDate("date_added").toLocalDate());

        return note;
    }
}
