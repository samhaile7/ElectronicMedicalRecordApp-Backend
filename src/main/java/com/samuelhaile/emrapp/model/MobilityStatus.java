package com.samuelhaile.emrapp.model;

import jakarta.persistence.*;

public class MobilityStatus {

    @Entity(name = "Mobility Status")
    public class Job {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long mobilityStatusId;
        @Column(nullable = false)
        private String statusDescription;
    }
}
