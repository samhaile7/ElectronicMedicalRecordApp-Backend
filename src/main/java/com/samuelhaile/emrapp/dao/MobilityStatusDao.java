package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.MobilityStatus;

import java.util.List;

public interface MobilityStatusDao {
    MobilityStatus createMobilityStatus(MobilityStatus mobilityStatus);

    void updateMobilityStatus(MobilityStatus mobilityStatus);

    List<MobilityStatus> listAllMobilityStatuses();

    MobilityStatus getMobilityStatusById(int mobilityStatusId);
}
