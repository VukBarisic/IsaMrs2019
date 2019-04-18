package com.smv.AirSpace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smv.AirSpace.model.Rentacar;
import com.smv.AirSpace.repository.RentacarRepository;

@Service
public class RentacarServiceImpl implements RentacarService {
	
	@Autowired
	RentacarRepository rentacarRepository;

	@Override
	public void saveRentacar() {
		
	}

	@Override
	public List<Rentacar> getAll() {
		return rentacarRepository.findAll();
	}

	@Override
	public List<String> getAllNames() {
		return rentacarRepository.getAllNames();
	}
	

}
