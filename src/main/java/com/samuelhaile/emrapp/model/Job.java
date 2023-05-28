package com.samuelhaile.emrapp.model;

import jakarta.persistence.*;

@Entity(name = "Job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long jobId;
    @Column (nullable = false)
    private String jobTitle;

}
