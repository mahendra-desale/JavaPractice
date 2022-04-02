package com.example.bookings.dao;

import java.util.UUID;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

import com.example.bookings.controller.model.Bookings;

public interface BookingDao extends ReactiveCassandraRepository<Bookings, UUID> {

}
