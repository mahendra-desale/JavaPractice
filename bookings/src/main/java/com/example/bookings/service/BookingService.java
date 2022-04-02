package com.example.bookings.service;

import org.json.JSONException;

import com.example.bookings.controller.model.Container;

public interface BookingService {
	
	public boolean isBookingAvailable(Container container) throws JSONException;
	
	public String getUUID(Container container);

}

