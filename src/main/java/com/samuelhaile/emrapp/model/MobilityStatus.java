package com.samuelhaile.emrapp.model;

public class MobilityStatus {

	int mobilityStatusId;

	String mobilityStatusDescription;

	public MobilityStatus(int mobilityStatusId, String mobilityStatusDescription) {
		this.mobilityStatusId = mobilityStatusId;
		this.mobilityStatusDescription = mobilityStatusDescription;
	}

	public MobilityStatus() {
	}

	public int getMobilityStatusId() {
		return mobilityStatusId;
	}

	public void setMobilityStatusId(int mobilityStatusId) {
		this.mobilityStatusId = mobilityStatusId;
	}

	public String getMobilityStatusDescription() {
		return mobilityStatusDescription;
	}

	public void setMobilityStatusDescription(String mobilityStatusDescription) {
		this.mobilityStatusDescription = mobilityStatusDescription;
	}

	@Override
	public String toString() {
		return "MobilityStatus{" + "mobilityStatusId=" + mobilityStatusId + ", mobilityStatusDescription='"
				+ mobilityStatusDescription + '\'' + '}';
	}

}
