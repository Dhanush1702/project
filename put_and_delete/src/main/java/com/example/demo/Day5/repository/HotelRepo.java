package com.example.demo.Day5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Day5.model.HotelModel;


public interface HotelRepo extends JpaRepository<HotelModel, Integer>{

	List<HotelModel> findAll();
	
}
