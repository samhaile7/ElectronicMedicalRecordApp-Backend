package com.samuelhaile.emrapp.repo;

import com.samuelhaile.emrapp.model.MobilityStatus;
import com.samuelhaile.emrapp.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobilityStatusRepository extends JpaRepository<MobilityStatus, Long> {

   MobilityStatus findByMobilityStatusId(Long mobilityStatusId);



}
