package com.smv.AirSpace.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.smv.AirSpace.model.Hotel;

public interface HotelRepository extends Repository<Hotel, Long> {
	
	Hotel findByName(String name);
	
	List<Hotel> findAll();

	Hotel save(Hotel hotel);

	void deleteAll();

}
