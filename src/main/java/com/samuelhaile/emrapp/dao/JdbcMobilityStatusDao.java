package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.MobilityStatus;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcMobilityStatusDao implements MobilityStatusDao {
    private JdbcTemplate jdbcTemplate;
    public JdbcMobilityStatusDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public MobilityStatus createMobilityStatus(MobilityStatus mobilityStatus) {
        return null;
    }

    @Override
    public void updateMobilityStatus(MobilityStatus mobilityStatus) {

    }

    @Override
    public List<MobilityStatus> listAllMobilityStatuses() {
        return null;
    }

    @Override
    public MobilityStatus getMobilityStatusById(int mobilityStatusId) {
        return null;
    }

}
