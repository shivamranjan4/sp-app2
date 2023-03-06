package com.example.spapp2.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.spapp2.entity.Owner;
import com.example.spapp2.entity.SwimmingPool;

public interface SwimmingPoolRepository extends CrudRepository<SwimmingPool , Integer>{
	
	public Iterable<SwimmingPool> findAllByTitleLike(String title) ;
	public Iterable<SwimmingPool> findByOwner(Owner owner);
	public Iterable<SwimmingPool> findAllByCityLikeAndStateLikeAndCountryLike(String city , String state , String country) ;
//	public Iterable<SwimmingPool> findAllByAppUser(AppUser appUser);
}
