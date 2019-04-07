package com.smv.AirSpace.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smv.AirSpace.dto.VehicleDTO;
import com.smv.AirSpace.model.Vehicle;
import com.smv.AirSpace.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
    VehicleRepository vehicleRepository;

	
	public void addVehicle(VehicleDTO vehicleDTO) {
		Vehicle vehicle = new Vehicle(0L, vehicleDTO.getModel(), vehicleDTO.getGearBox(), vehicleDTO.getNumOfSeats());
		
		vehicleRepository.save(vehicle);
	}
	
	public List<Vehicle> getAllVehicles(){
		return vehicleRepository.findAll();
		
	}
	
	public void delete(Long id) {
		vehicleRepository.deleteById(id);	
	}
	
	public Vehicle getOne(Long id) {
		return vehicleRepository.getOne(id);
	}
	
	
	
	//NE VALJA
	public List<Vehicle> findByModel(String param) {
		List<Vehicle> results = new ArrayList<Vehicle>();
		results = vehicleRepository.findAll();
		for (Vehicle vehicle : results) {
			if (vehicle.getModel().toLowerCase().contains(param.toLowerCase())){
				results.add(vehicle);	
			}
			else
				continue;
		}
		return results;
		
	}

	
}
