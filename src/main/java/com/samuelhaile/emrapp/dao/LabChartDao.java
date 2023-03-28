package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.LabChart;

import java.util.List;

public interface LabChartDao {


    List<LabChart> listAllLabCharts();

    LabChart getLabChartByPatientId(int patientId);

    LabChart createLabChart(LabChart labChart, int patientId);

    void delete(int labChart);

    void update(LabChart labChart);


}
