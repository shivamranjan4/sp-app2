package com.example.spapp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spapp2.entity.AppUser;
import com.example.spapp2.entity.Customer;
import com.example.spapp2.repository.CustomerRepostitory;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepostitory customerRepostitory ;
	
	//-------------------------------------------------------------------------------------------------------
	public Customer save(Customer customer)
	{
		return customerRepostitory.save(customer);
	}
	
	//-------------------------------------------------------------------------------------------------------
	public Customer findByAppUser(AppUser appUser)
	{
		return customerRepostitory.findByAppUser(appUser);
	}
	
}
