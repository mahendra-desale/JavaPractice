package com.example.bookings.controller;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.bookings.controller.model.Booking;
import com.example.bookings.controller.model.BookingRef;
import com.example.bookings.controller.model.Container;
import com.example.bookings.service.BookingService;
import com.example.bookings.validator.ContValidator;
import com.example.bookings.validator.ContainerValidator;

@RestController
@RequestMapping("/api")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@Autowired
	ContainerValidator validator;
	
	@Autowired
	ContValidator contValidator;
	
	@RequestMapping(value = { "/bookings", "/" }, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Booking bookings(@RequestBody Container container, BindingResult result, SessionStatus status) {
		Booking bookingResponse = new Booking();

		// Validation code
		validator.validate(container, result);

		// Checking validation
		if (result.hasErrors()) {
			return null;
		}
		try {
			bookingResponse.setAvailableSpace(bookingService.isBookingAvailable(container));

		} catch (JSONException e) {
			e.printStackTrace();
		}

		status.setComplete();
		
		//Redirecting to endpoint /bookingRef
		ServerResponse.ok().render("redirect:/bookingRef");
		
		return bookingResponse;
	}
	
	@RequestMapping(value = { "/bookingRef", "/" }, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
	public BookingRef bookingRef(@RequestBody Container container, BindingResult result, SessionStatus status) {
		BookingRef bookingRef = new BookingRef();
		
		// Validation code
		contValidator.validate(container, result);

		// Checking validation
		if (result.hasErrors()) {
			return null;
		}
		bookingRef.setBookingRef(bookingService.getUUID(container));
		
		status.setComplete();
		
		return bookingRef;
	}

}
