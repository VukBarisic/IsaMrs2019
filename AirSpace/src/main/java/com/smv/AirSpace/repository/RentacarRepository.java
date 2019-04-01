package com.smv.AirSpace.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.smv.AirSpace.model.Rentacar;

public interface RentacarRepository extends Repository<Rentacar, Long> {
	
	Rentacar findByName(String name);
	
	List<Rentacar> findAll();

	Rentacar save(Rentacar airline);

	void deleteAll();


}
