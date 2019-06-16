package com.smv.AirSpace.service;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smv.AirSpace.dto.VehicleDTO;
import com.smv.AirSpace.model.BranchOffice;
import com.smv.AirSpace.model.Rentacar;
import com.smv.AirSpace.model.Vehicle;
import com.smv.AirSpace.repository.VehicleRepository;

import exceptions.VehicleDoesntExistException;

@Service
public class VehicleService {
	
	@Autowired
    VehicleRepository vehicleRepository;
	
	@Autowired
	RentacarServiceImpl rentaCarService;

	
	public Vehicle saveVehicle(VehicleDTO vehicleDTO)
	{
		Vehicle vehicle = new Vehicle(vehicleDTO);
		/*
		if(vehicleRepository.findById(vehicle.getId())!=null){
			vehicleRepository.save(vehicle);
			throw new VehicleAlreadyExistsException();
			
		}
		*/
		
		return vehicleRepository.save(vehicle);
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
	
	public List<Vehicle> findByGearBox(String searchParam, Principal principal) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		List<Vehicle> rets = new ArrayList<Vehicle>();
		Rentacar rentaCar = rentaCarService.getLoggedAdminRentacar(principal);
		vehicles = vehicleRepository.findAll();
		for (Vehicle vehicle : vehicles) {
			if(vehicle.getGearBox().toLowerCase().contains(searchParam.toLowerCase()) & vehicle.findRentaCar().getId()==rentaCar.getId()){
				rets.add(vehicle);
			}
		}
		return rets;
	}
	
	public List<Vehicle> findByModel(String searchParam, Principal principal) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		List<Vehicle> rets = new ArrayList<Vehicle>();
		Rentacar rentaCar = rentaCarService.getLoggedAdminRentacar(principal);
		vehicles = vehicleRepository.findAll();
		for (Vehicle vehicle : vehicles) {
			if(vehicle.getModel().toLowerCase().contains(searchParam.toLowerCase()) & vehicle.findRentaCar().getId()==rentaCar.getId()){
				rets.add(vehicle);
			}
		}
		return rets;
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
