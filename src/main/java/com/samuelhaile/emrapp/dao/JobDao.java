package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.Job;

import java.util.List;

public interface JobDao {
    Job createJob(Job job);
    void updateJob(Job job);
    List<Job> listAllJobs();
    Job getJobByJobId(int jobId);
    void deleteJob(int jobId);
}
