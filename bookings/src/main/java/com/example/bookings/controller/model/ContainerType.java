package com.example.bookings.controller.model;

public enum ContainerType {
	DRY("DRY"), 
	REEFER("REEFER");

	private final String containerType;

	ContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getContainerType() {
		return containerType;
	}
}
