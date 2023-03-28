package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.LabChart;

import java.util.List;

public class JdbcLabChartDao implements LabChartDao {
    @Override
    public List<LabChart> listAllLabCharts() {
        return null;
    }

    @Override
    public LabChart getLabChartByPatientId(int patientId) {
        return null;
    }

    @Override
    public LabChart createLabChart(LabChart labChart, int patientId) {
        return null;
    }

    @Override
    public void delete(int labChart) {

    }

    @Override
    public void update(LabChart labChart) {

    }
}
