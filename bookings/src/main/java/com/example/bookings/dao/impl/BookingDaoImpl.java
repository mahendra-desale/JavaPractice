package com.example.bookings.dao.impl;

import java.util.UUID;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Repository;

import com.example.bookings.controller.model.Bookings;
import com.example.bookings.dao.BookingDao;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class BookingDaoImpl implements BookingDao {

	@Override
	public Flux<Bookings> findAllById(Iterable<UUID> iterable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Bookings> findAllById(Publisher<UUID> publisher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Bookings> Mono<S> insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Bookings> Flux<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Bookings> Flux<S> insert(Publisher<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Long> count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> delete(Bookings entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteAll(Iterable<? extends Bookings> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteAll(Publisher<? extends Bookings> entityStream) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteAllById(Iterable<? extends UUID> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteById(Publisher<UUID> id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Boolean> existsById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Boolean> existsById(Publisher<UUID> id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Bookings> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Bookings> findById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Bookings> findById(Publisher<UUID> id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Bookings> Mono<S> save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Bookings> Flux<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Bookings> Flux<S> saveAll(Publisher<S> entityStream) {
		// TODO Auto-generated method stub
		return null;
	}}
