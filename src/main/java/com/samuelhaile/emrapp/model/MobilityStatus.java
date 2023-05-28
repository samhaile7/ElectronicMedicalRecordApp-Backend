package com.samuelhaile.emrapp.model;

import jakarta.persistence.*;

import java.util.List;
@Entity(name = "MobilityStatus")
public class MobilityStatus {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long mobilityStatusId;

        @Column(nullable = false)
        private String statusDescription;

        @OneToMany(mappedBy = "mobilityStatus")
        private List<Patient> patients;

    public MobilityStatus() {
    }

    public MobilityStatus(Long mobilityStatusId, String statusDescription, List<Patient> patients) {
        this.mobilityStatusId = mobilityStatusId;
        this.statusDescription = statusDescription;
        this.patients = patients;
    }

    public Long getMobilityStatusId() {
        return mobilityStatusId;
    }

    public void setMobilityStatusId(Long mobilityStatusId) {
        this.mobilityStatusId = mobilityStatusId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
