package com.samuelhaile.emrapp.controller;

import com.samuelhaile.emrapp.dao.JobDao;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.samuelhaile.emrapp.model.Job;

import java.util.List;

@RestController
@CrossOrigin
public class JobController {
    JobDao jobDao;

    public JobController(JobDao jobDao) {
        this.jobDao = jobDao;
    }
        @RequestMapping(path = "/jobs", method = RequestMethod.GET)
    public List<Job> listAllJobs() {
        return jobDao.listAllJobs();
    }
    @RequestMapping(path = "/jobs/{jobId}", method = RequestMethod.GET)
    public Job getJobByJobId(@PathVariable int jobId) {
        Job job = jobDao.getJobByJobId(jobId);
        if (job == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Job Not Found");
        } else {
            return job;
        }
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/jobs", method = RequestMethod.POST)
    public Job createJob(@RequestBody @Valid Job newJob) {
        return jobDao.createJob(newJob);
    }

    @RequestMapping(path = "/jobs", method = RequestMethod.PUT)
    public void updateJob(@RequestBody @Valid Job jobToUpdate) {
        if (jobDao.getJobByJobId(jobToUpdate.getJobId()) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Job Not Found");
        }
        jobDao.updateJob(jobToUpdate);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path = "/jobs/{jobId}", method = RequestMethod.DELETE)
    public void deleteJob(@PathVariable int jobId) {
        if (jobDao.getJobByJobId(jobId) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Job Not Found");
        }
        jobDao.deleteJob(jobId);
    }
}
