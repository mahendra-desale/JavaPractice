package com.example.bookings.controller.model;

import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Bookings {
	@PrimaryKey
	private UUID booking_ref;
	private String container_type;
	private Integer container_size;
	private String origin;
	private String destination;
	private Integer quantity;
	private Timestamp timestamp;
	
	public Bookings() {
		
	}
	
	public Bookings(UUID booking_ref, String container_type, Integer container_size, String origin, String destination,
			Integer quantity, Timestamp timestamp) {
		super();
		this.booking_ref = booking_ref;
		this.container_type = container_type;
		this.container_size = container_size;
		this.origin = origin;
		this.destination = destination;
		this.quantity = quantity;
		this.timestamp = timestamp;
	}
	
	public UUID getBooking_ref() {
		return booking_ref;
	}

	public void setBooking_ref(UUID booking_ref) {
		this.booking_ref = booking_ref;
	}
	
	public String getContainer_type() {
		return container_type;
	}
	public void setContainer_type(String container_type) {
		this.container_type = container_type;
	}
	public Integer getContainer_size() {
		return container_size;
	}
	public void setContainer_size(Integer container_size) {
		this.container_size = container_size;
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
