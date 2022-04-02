package com.example.bookings.service.impl;

import java.util.UUID;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.bookings.controller.model.Bookings;
import com.example.bookings.controller.model.Container;
import com.example.bookings.dao.BookingDao;
import com.example.bookings.service.BookingService;

import reactor.core.publisher.Mono;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	BookingDao bookingDao;

	@Override
	public boolean isBookingAvailable(Container container) throws JSONException {
		JSONObject jsonObject = checkAvailable();
		Integer availableSpace = jsonObject.getInt("availableSpace”");

		if (availableSpace > 0) {
			return true;
		} else {
			return false;
		}

	}

	private JSONObject checkAvailable() throws JSONException {
		final String uri = "https://maersk.com/api/bookings/checkAvailable";

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		JSONObject jsonObject = new JSONObject(result);
		return jsonObject;
	}

	@Override
	public String getUUID(Container container) {
		// Save the Bookings object
		// on successful save it will return bookingRef id
		Bookings bookings = new Bookings(UUID.randomUUID(), container.getContainerType().getContainerType(),
				container.getContainerSize(), container.getDestination(), container.getOrigin(),
				container.getQuantity(), container.getTimestamp());

		 Mono<Bookings>  bk = bookingDao.save(bookings);
		 return bk.block().getBooking_ref().toString();
	}

}
