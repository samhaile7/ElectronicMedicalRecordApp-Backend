package com.samuelhaile.emrapp.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeCheckerServiceTest {

	private RangeCheckerService rangeChecker;

	private Patient testPatient;

	private int CLEAR_FOR_MOBILITY_STATUS_ID = 1;

	private int NOT_CLEAR_FOR_MOBILITY_STATUS_ID = 2;

	@BeforeEach
	void createsRangeCheckerAndNewPatient() {

		this.rangeChecker = new RangeCheckerService();
		this.testPatient = new Patient("John", "Doe", LocalDate.of(2000, 04, 03), LocalDate.of(2022, 01, 03), 60, 20,
				98, 99, 15, 100, 80, 0);

	}

	@Test
	void assigned_mobility_status_is_clear_with_stats_in_range() {
		Patient outputPatient = rangeChecker.assignPatientMobilityStatus(testPatient);
		assertEquals(CLEAR_FOR_MOBILITY_STATUS_ID, outputPatient.getMobilityStatusId(),
				"Should assign mobility id 1 when values are in range");

	}

	@Test
	void assigned_mobility_status_is_notclear_with_stats_in_out_of_range() {
		// given
		testPatient.setSystolicBloodPressure(200);
		// when
		Patient outputPatient = rangeChecker.assignPatientMobilityStatus(testPatient);

		// then
		assertThat(outputPatient.getMobilityStatusId()).isEqualTo(NOT_CLEAR_FOR_MOBILITY_STATUS_ID);

		// assertEquals(NOT_CLEAR_FOR_MOBILITY_STATUS_ID,
		// outputPatient.getMobilityStatusId(),
		// "Should assign mobility id 2 when values are out of range");
	}

}
