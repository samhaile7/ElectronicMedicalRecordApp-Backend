package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.Patient;
import com.samuelhaile.emrapp.model.Provider;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;

public class JdbcProviderDao implements ProviderDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Provider> listAllProviders() {
        List<Provider> listOfProviders = new ArrayList<>();


        String sql = "SELECT provider_id, first_name, last_name, job_title " +
                "FROM provider; ";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {
            listOfProviders.add(mapRowToProvider(results));
        }
        return listOfProviders;

    }

    @Override
    public Provider getProviderById(int providerId) {

        Provider provider = null;

        String sql =
                "SELECT provider_id, first_name, last_name, job_title " +
                        "                FROM provider   " +
                        "                WHERE provider_id = ?; ";


        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, providerId);

        if (results.next()) {
            provider = mapRowToProvider(results);
        }
        return provider;
    }

    @Override
    public Provider createProvider(Provider provider) {


        String sql = "INSERT INTO provider (first_name, last_name, job_title " +

                "VALUES (?, ?, ?) RETURNING provider_id;";
        Integer providerId = jdbcTemplate.queryForObject(sql, Integer.class, provider.getFirstName(), provider.getLastName(),
                provider.getJobTitle());
        provider.setProviderId(providerId); ;
        return provider;
    }

    @Override
    public void deleteProvider(int providerId) {
        String sql = "DELETE FROM provider WHERE provider_id = ?";
        jdbcTemplate.update(sql, providerId);
    }

    @Override
    public void updateProvider(Provider provider) {

        String sql = "UPDATE provider SET first_name = ?, last_name = ?, job_title = ? " +
                "WHERE provider_id = ?";

        jdbcTemplate.update(sql, provider.getFirstName(), provider.getLastName(),
                provider.getJobTitle());
    }

    @Override
    public List<Patient> listAllPatientsUnderProvider() {
        return null;
    }



    private Provider mapRowToProvider(SqlRowSet row) {
        Provider provider = new Provider();

        provider.setProviderId(row.getInt("provider_id"));
        provider.setFirstName(row.getString("first_name"));
        provider.setLastName(row.getString("last_name"));
        provider.setJobTitle(row.getString("job_title"));

        return provider;

    }
}
