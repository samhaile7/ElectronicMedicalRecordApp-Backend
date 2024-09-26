package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.MobilityStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcMobilityStatusDao implements MobilityStatusDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcMobilityStatusDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public MobilityStatus createMobilityStatus(MobilityStatus mobilityStatus) {
		MobilityStatus newMobilityStatus = new MobilityStatus();
		String sql = "INSERT INTO mobility_status (mobility_status_description) "
				+ "VALUES (?) RETURNING mobility_status_id;";
		Integer mobilityStatusId = jdbcTemplate.queryForObject(sql, Integer.class,
				mobilityStatus.getMobilityStatusDescription());
		newMobilityStatus.setMobilityStatusId(mobilityStatusId);
		return newMobilityStatus;
	}

	@Override
	public void updateMobilityStatus(MobilityStatus mobilityStatus) {
		String sql = "UPDATE mobility_status SET mobility_status_description = ? WHERE mobility_status_id = ?;";
		jdbcTemplate.update(sql, mobilityStatus.getMobilityStatusDescription(), mobilityStatus.getMobilityStatusId());

	}

	@Override
	public List<MobilityStatus> listAllMobilityStatuses() {
		List<MobilityStatus> mobilityStatuses = new ArrayList<>();
		String sql = "SELECT mobility_status_id, mobility_status_description FROM mobility_status;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			mobilityStatuses.add(mapRowToMobilityStatus(results));
		}
		return mobilityStatuses;
	}

	@Override
	public MobilityStatus getMobilityStatusById(int mobilityStatusId) {
		MobilityStatus mobilityStatus = null;
		String sql = "SELECT mobility_status_id, mobility_status_description FROM mobility_status WHERE mobility_status_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, mobilityStatusId);
		if (results.next()) {
			mobilityStatus = mapRowToMobilityStatus(results);
		}
		return mobilityStatus;
	}

	private MobilityStatus mapRowToMobilityStatus(SqlRowSet row) {
		MobilityStatus mobilityStatus = new MobilityStatus();
		mobilityStatus.setMobilityStatusId(row.getInt("mobility_status_id"));
		mobilityStatus.setMobilityStatusDescription(row.getString("mobility_status_description"));
		return mobilityStatus;
	}

}
