package com.example.bookings.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.bookings.BookingsApplication;
import com.example.bookings.service.BookingService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookingsApplication.class)
class BookingControllerTest {
	
	MockMvc mockMvc;
	
    @Mock 
    private BookingService bookingService;
    
    @InjectMocks 
    private BookingController bookingController;
    
	private final String jsonBoking = "{\"containerType”\": \"DRY”,\", \"containerSize”\": 20, \"origin”\": \"Southampton”, \"destination”\": \"Singapore”, \"quantity”\": 5}";
	
	private final String jsonBokingRef = "{\"containerType”\": \"DRY”,\", \"containerSize”\": 20, \"origin”\": \"Southampton”, \"destination”\": \"Singapore”, \"quantity”\": 5, \"timestamp\": \"2020-10-12T13:53:09Z”}";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Before
	void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders
          .standaloneSetup(bookingController)
          .build();
	}

	@Test
	void testBookings() {
		try {
			when(mockMvc.perform(post("/api/bookings/").content(jsonBoking).contentType("application/json"))
					.andDo(print()).andExpect(status().isOk()));
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	@Test
	void testBookingRef() {
		try {
			when(mockMvc.perform(post("/api/bookings/").content(jsonBokingRef).contentType("application/json"))
					.andDo(print()).andExpect(status().isOk()));
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

}
