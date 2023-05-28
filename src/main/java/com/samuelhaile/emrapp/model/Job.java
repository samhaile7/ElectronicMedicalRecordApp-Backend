package com.samuelhaile.emrapp.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long jobId;
    @Column (nullable = false)
    private String jobTitle;

    @OneToMany(mappedBy = "job")
    List<Provider> providers;


}
