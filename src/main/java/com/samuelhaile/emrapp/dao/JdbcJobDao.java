package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.Job;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcJobDao implements JobDao {

    private JdbcTemplate jdbcTemplate;
    public JdbcJobDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public Job createJob(Job job) {
        return null;
    }

    @Override
    public void updateJob(Job job) {

    }

    @Override
    public List<Job> listAllJobs() {
        return List.of();
    }

    @Override
    public Job getJobByJobId(int jobId) {
        return null;
    }

    @Override
    public void deleteJob(int jobId) {

    }
}
