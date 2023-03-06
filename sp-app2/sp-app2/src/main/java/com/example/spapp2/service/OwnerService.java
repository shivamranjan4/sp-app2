package com.example.spapp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spapp2.entity.Owner;
import com.example.spapp2.repository.OwnerRepository;

@Service
public class OwnerService {
	
	@Autowired
	private OwnerRepository ownerRepository ;
	
	//-------------------------------------------------------------------------------------------------------
	public Owner save(Owner owner)
	{
		return ownerRepository.save(owner) ;
	}
	
	
}
