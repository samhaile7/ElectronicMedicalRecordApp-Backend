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

    public Job() {
    }

    public Job(Long jobId, String jobTitle, List<Provider> providers) {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.providers = providers;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Provider> getProviders() {
        return providers;
    }

    public void setProviders(List<Provider> providers) {
        this.providers = providers;
    }
}
