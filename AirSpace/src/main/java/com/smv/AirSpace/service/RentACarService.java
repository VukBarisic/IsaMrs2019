package com.smv.AirSpace.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smv.dto.VehicleDTO;
import com.smv.model.Vehicle;

@Service
public class RentACarService {
	
	public static List<Vehicle> vehicles;
	
	public void addVehicle(VehicleDTO vehicleDTO) {
		Vehicle vehicle = new Vehicle(0L, vehicleDTO.getModel(), vehicleDTO.getNumOfSeats());
		
		vehicles.add(vehicle);
	}
	
	public List<Vehicle> getAllVehicles(){
		vehicles = new ArrayList<Vehicle>();
		Vehicle vehicle1 = new Vehicle(1L, "Opel", 5);
		Vehicle vehicle2 = new Vehicle(2L, "Mercedes", 5);
		Vehicle vehicle3 = new Vehicle(3L, "BMW", 4);
		vehicles.add(vehicle1);
		vehicles.add(vehicle2);
		vehicles.add(vehicle3);
		System.out.println("Dodata dummy vozila");
		
		return vehicles;
	}
	
	public List<Vehicle> findByModel(String param) {
		List<Vehicle> results = new ArrayList<Vehicle>();
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getModel().toLowerCase().contains(param.toLowerCase())){
				results.add(vehicle);	
			}
			else
				continue;
		}
		return results;
		
	}
}
