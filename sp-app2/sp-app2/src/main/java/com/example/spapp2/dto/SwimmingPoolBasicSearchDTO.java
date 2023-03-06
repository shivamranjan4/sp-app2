package com.example.spapp2.dto;

import java.util.HashSet;
import java.util.Set;

import com.example.spapp2.entity.SwimmingPool;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SwimmingPoolBasicSearchDTO {
	private boolean status;
	private String message;
	
	private Iterable<SwimmingPool> pools;
}
