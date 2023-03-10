package com.example.spapp2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spapp2.dto.BookingDTO;
import com.example.spapp2.dto.DeletedBookingDTO;
import com.example.spapp2.entity.Booking;
import com.example.spapp2.service.BookingService;


@RestController
@RequestMapping("booking")
@CrossOrigin
public class BookingController {

	@Autowired
	private BookingService bookingService;;
	//-------------------------------------------------------------------------------------------------------
	
	@PostMapping("save")
	public ResponseEntity<Booking> save(@RequestBody BookingDTO bookingDTO)
	{
		return ResponseEntity.ok(bookingService.save(bookingDTO));
	}
	//-------------------------------------------------------------------------------------------------------
	//LOAD ALL THE bookings for owner
	@GetMapping("load/{email}")
	public ResponseEntity<Iterable<Booking>> load(@PathVariable String email)
	{
		return ResponseEntity.ok(bookingService.load(email));
	}
	//-------------------------------------------------------------------------------------------------------
	// deleting all the bookings
	@DeleteMapping("delete/{id}")
	public ResponseEntity<DeletedBookingDTO> delete(@PathVariable Integer id)
	{
		return ResponseEntity.ok(bookingService.delete(id));
	}
	//-------------------------------------------------------------------------------------------------------
	//loading pools for customer
	@GetMapping("loadCustBooking/{email}")
	public ResponseEntity<Iterable<Booking>> loadCustBooking(@PathVariable String email)
	{
		return ResponseEntity.ok(bookingService.loadCustBooking(email));
	}
	//-------------------------------------------------------------------------------------------------------
	//find pool by by id
	@GetMapping("findBooking/{id}")
	public ResponseEntity<Optional<Booking>> findBooking(@PathVariable Integer id)
	{
		return ResponseEntity.ok(bookingService.findBooking(id));
	}
	//-------------------------------------------------------------------------------------------------------
	//updating the booking
	@PostMapping("update")
	public ResponseEntity<Booking> update(@RequestBody BookingDTO bookingDTO)
	{
		return ResponseEntity.ok(bookingService.update(bookingDTO));
	}
}
