package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.Job;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcJobDao implements JobDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcJobDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Job createJob(Job job) {
		String sql = "INSERT INTO job_title (job_title_name) " + "VALUES (?) RETURNING job_title_id;";
		Integer jobId = jdbcTemplate.queryForObject(sql, Integer.class, job.getJobName());
		job.setJobId(jobId);
		return job;
	}

	@Override
	public void updateJob(Job job) {
		String sql = "UPDATE job_title SET job_title_name = ? WHERE job_title_id = ?;";
		jdbcTemplate.update(sql, job.getJobName(), job.getJobId());

	}

	@Override
	public List<Job> listAllJobs() {
		List jobs = new ArrayList<>();
		String sql = "SELECT job_title_id, job_title_name FROM job_title;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			jobs.add(mapRowToJob(results));
		}

		return jobs;
	}

	@Override
	public Job getJobByJobId(int jobId) {
		Job job = null;
		String sql = "SELECT job_title_id, job_title_name FROM job_title WHERE job_title_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, jobId);
		if (results.next()) {
			job = mapRowToJob(results);
		}
		return job;
	}

	@Override
	public void deleteJob(int jobId) {
		String sql = "DELETE FROM job_title WHERE job_title_id = ?;";
		jdbcTemplate.update(sql, jobId);

	}

	private Job mapRowToJob(SqlRowSet row) {
		Job job = new Job();
		job.setJobId(row.getInt("job_title_id"));
		job.setJobName(row.getString("job_title_name"));
		return job;
	}

}
