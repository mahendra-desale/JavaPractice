package com.example.bookings.controller.model;

import java.sql.Timestamp;

public class Container {
	
	private ContainerType containerType;
	private Integer containerSize;
	private String origin;
	private String destination;
	private Integer quantity;
	private Timestamp timestamp;
	
	public ContainerType getContainerType() {
		return containerType;
	}
	public void setContainerType(ContainerType containerType) {
		this.containerType = containerType;
	}
	public Integer getContainerSize() {
		return containerSize;
	}
	public void setContainerSize(Integer containerSize) {
		this.containerSize = containerSize;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}
