package com.smv.AirSpace.service;

import java.util.List;

import com.smv.AirSpace.model.Rentacar;

public interface RentacarService {

	public void saveRentacar();
	public List<Rentacar> getAll();
	public List<String> getAllNames();
	
	
}
