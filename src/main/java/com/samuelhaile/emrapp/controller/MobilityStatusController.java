package com.samuelhaile.emrapp.controller;

import com.samuelhaile.emrapp.dao.MobilityStatusDao;
import com.samuelhaile.emrapp.model.MobilityStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class MobilityStatusController {

	MobilityStatusDao mobilityStatusDao;

	public MobilityStatusController(MobilityStatusDao mobilityStatusDao) {
		this.mobilityStatusDao = mobilityStatusDao;
	}

	@RequestMapping(path = "/mobilitystatus")
	public List<MobilityStatus> getAllMobilityStatuses() {
		return mobilityStatusDao.listAllMobilityStatuses();

	}

	@RequestMapping(path = "/mobilitystatus/{mobilityStatusId}")
	public MobilityStatus getMobilityStatusByMobilityStatusId(int mobilityStatusId) {
		return mobilityStatusDao.getMobilityStatusById(mobilityStatusId);
	}

}
