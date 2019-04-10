package com.smv.AirSpace.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smv.AirSpace.dto.VehicleDTO;
import com.smv.AirSpace.model.Vehicle;
import com.smv.AirSpace.repository.VehicleRepository;

import exceptions.VehicleAlreadyExistsException;
import exceptions.VehicleDoesntExistException;

@Service
public class VehicleService {
	
	@Autowired
    VehicleRepository vehicleRepository;

	
	public Vehicle saveVehicle(VehicleDTO vehicleDTO)
	{
		Vehicle vehicle = new Vehicle(vehicleDTO);
		if(vehicleRepository.findById(vehicle.getId())!=null){
			throw new VehicleAlreadyExistsException();
			
		}
		vehicleRepository.save(vehicle);
		return vehicle;
	}
	
	public List<Vehicle> getAllVehicles(){
		return vehicleRepository.findAll();
		
	}
	
	public void delete(Long id) {
		try {
			vehicleRepository.deleteById(id);
		} catch (Exception e) {
			throw new VehicleDoesntExistException();
		}
		
	}
	
	public Vehicle findByID(Long id) {
		Optional<Vehicle> rets = vehicleRepository.findById(id);
		if(!rets.isPresent()) {
			throw new VehicleDoesntExistException();
		}
		return rets.get();
	}
	

	public Vehicle update(VehicleDTO vehicleDTO) {
		try {
			findByID(vehicleDTO.getId());
			Vehicle vehicle = new Vehicle(vehicleDTO);
			vehicleRepository.save(vehicle);
			return vehicle;
		} catch (Exception e) {
			throw new VehicleDoesntExistException();
		}
		
		
	}


	
}
