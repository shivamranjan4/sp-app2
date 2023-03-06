package com.example.spapp2.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spapp2.entity.AppUser;
import com.example.spapp2.entity.Customer;


public interface CustomerRepostitory extends CrudRepository<Customer, Integer> {

	public Customer findByAppUser(AppUser appUser);
}
