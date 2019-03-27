package com.smv.AirSpace.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smv.dto.VehicleDTO;
import com.smv.model.Vehicle;

@Service
public class RentACarService {
	
	public static List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public void addVehicle(VehicleDTO vehicleDTO) {
		Vehicle vehicle = new Vehicle(0L, vehicleDTO.getModel(), vehicleDTO.getNumOfSeats());
		
		vehicles.add(vehicle);
	}
	
	public List<Vehicle> getAllVehicles(){
		Vehicle vehicle1 = new Vehicle(1L, "Opel", 5);
		vehicles.add(vehicle1);
		
		return vehicles;
	}
}
