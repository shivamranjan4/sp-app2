package com.example.spapp2.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.spapp2.entity.AppUser;
import com.example.spapp2.entity.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Integer>{

	public Owner findByAppUser(AppUser appUser) ;
}
