package com.example.spapp2.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spapp2.entity.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer> {

}
