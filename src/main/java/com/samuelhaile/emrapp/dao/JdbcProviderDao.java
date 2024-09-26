package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.Patient;
import com.samuelhaile.emrapp.model.Provider;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProviderDao implements ProviderDao {

	private JdbcTemplate jdbcTemplate;

	private JdbcPatientDao patientDao;

	public JdbcProviderDao(JdbcPatientDao patientDao, JdbcTemplate jdbcTemplate) {

		this.patientDao = patientDao;
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Provider> listAllProviders() {
		List<Provider> listOfProviders = new ArrayList<>();

		String sql = "SELECT provider_id, first_name, last_name, job_title_id " + "FROM provider; ";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

		while (results.next()) {
			listOfProviders.add(mapRowToProvider(results));
		}
		return listOfProviders;

	}

	@Override
	public Provider getProviderById(int providerId) {

		Provider provider = null;

		String sql = "SELECT provider_id, first_name, last_name, job_title_id " + "                FROM provider   "
				+ "                WHERE provider_id = ?; ";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, providerId);

		if (results.next()) {
			provider = mapRowToProvider(results);
		}
		return provider;
	}

	@Override
	public String getProviderRole(int providerId) {
		String sql = "SELECT job_title_name " + "                FROM provider   "
				+ "                JOIN job_title ON provider.job_title_id = job_title.job_title_id   "
				+ "                WHERE provider_id = ?; ";
		String roleString = jdbcTemplate.queryForObject(sql, String.class, providerId);

		return roleString;
	}

	@Override
	public Provider createProvider(Provider provider) {

		String sql = "INSERT INTO provider (first_name, last_name, job_title_id) " +

				"VALUES (?, ?, ?) RETURNING provider_id;";
		Integer providerId = jdbcTemplate.queryForObject(sql, Integer.class, provider.getFirstName(),
				provider.getLastName(), provider.getJobTitleId());
		provider.setProviderId(providerId);
		;
		return provider;
	}

	@Override
	public void deleteProvider(int providerId) {
		String sql = "DELETE FROM provider WHERE provider_id = ?";
		jdbcTemplate.update(sql, providerId);
	}

	@Override
	public void updateProvider(Provider provider) {

		String sql = "UPDATE provider SET first_name = ? , last_name = ? , job_title_id = ?  "
				+ "                WHERE provider_id = ?";

		jdbcTemplate.update(sql, provider.getFirstName(), provider.getLastName(), provider.getJobTitleId(),
				provider.getProviderId());
	}

	@Override
	public void pickUpPatient(int patientId, int providerId) {

		String sql = "INSERT INTO patient_provider (patient_id, provider_id) " +

				"VALUES (?, ?) RETURNING patient_provider_id;";
		Integer patientProviderId = jdbcTemplate.queryForObject(sql, Integer.class, patientId, providerId);

	}

	@Override
	public List<Patient> listAllPatientsUnderProvider(int providerId) {

		List<Patient> listOfPatientsUnderProvider = new ArrayList<>();

		String sql = "SELECT patient.patient_id, first_name, last_name, birth_date, admit_date, pulse_rate,  "
				+ "                      respiration_rate, systolic_bp, diastolic_bp, sp_O2, temperature,  "
				+ "                     partial_thromboplastin_time, mobility_status_id   "
				+ "                    FROM patient " + "                    JOIN patient_provider  "
				+ "                    ON patient.patient_id = patient_provider.patient_id "
				+ "                    WHERE patient_provider.provider_id = ?; ";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, providerId);

		while (results.next()) {
			listOfPatientsUnderProvider.add(patientDao.mapRowToPatient(results));
		}
		return listOfPatientsUnderProvider;
	}

	private Provider mapRowToProvider(SqlRowSet row) {
		Provider provider = new Provider();

		provider.setProviderId(row.getInt("provider_id"));
		provider.setFirstName(row.getString("first_name"));
		provider.setLastName(row.getString("last_name"));
		provider.setJobTitleId(row.getInt("job_title_id"));

		return provider;

	}

}
