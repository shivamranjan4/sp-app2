package com.example.spapp2.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spapp2.entity.AppUser;


public interface AppUserRepository extends CrudRepository<AppUser, Integer> {
	
	public AppUser findByEmail(String email) ;
	
	public AppUser findByEmailAndPassword(String email , String password) ;
	
}
