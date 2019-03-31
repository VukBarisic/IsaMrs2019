package com.smv.AirSpace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smv.AirSpace.dto.VehicleDTO;
import com.smv.AirSpace.model.Vehicle;
import com.smv.AirSpace.service.RentACarService;

@RestController
@RequestMapping(value = "/rentacar")
public class RentACarController {
	
	@Autowired
	RentACarService rentACarService;
	
	//Create new vehicle.
	@RequestMapping(value="/addVehicle", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<VehicleDTO> addVehicle(@RequestBody VehicleDTO vehicleDTO){
			
		rentACarService.addVehicle(vehicleDTO);
		System.out.println("aaaaaaaa");
		System.out.println(vehicleDTO.getModel());
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//Get all vehicles
	@RequestMapping(value="/getVehicles", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Vehicle>> getVehicles(){
		try {
			System.out.println("kontroler");
			return new ResponseEntity<List<Vehicle>>(rentACarService.getAllVehicles(), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	
	@RequestMapping(value="/searchVehicles/{param}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Vehicle>> searchVehicles(@PathVariable String param){
		try {
			System.out.println("pretraga");
			System.out.println(param);
			return new ResponseEntity<List<Vehicle>>(rentACarService.findByModel(param), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
