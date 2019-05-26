package com.smv.AirSpace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smv.AirSpace.dto.VehicleDTO;
import com.smv.AirSpace.model.Vehicle;
import com.smv.AirSpace.service.VehicleService;


@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {

	@Autowired
	VehicleService vehicleService;

	

	// Create new vehicle.
	@PreAuthorize("hasAuthority('RENTACAR_ADMIN')")
	@PostMapping( consumes = "application/json")
	public ResponseEntity<Vehicle> addVehicle(@RequestBody VehicleDTO vehicleDTO) {

		Vehicle vehicle = vehicleService.saveVehicle(vehicleDTO);
		return new ResponseEntity<Vehicle>(vehicle, HttpStatus.CREATED);
	}
	
	// Get all vehicles
	@PreAuthorize("hasAuthority('RENTACAR_ADMIN')")
	@GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getVehicles() {
		try {
			return new ResponseEntity<List<Vehicle>>(vehicleService.getAllVehicles(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}
	
	@RequestMapping(value="/getVehicleByModel/{searchParam}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getVehicleByModel(@PathVariable String searchParam) {
		return new ResponseEntity<List<Vehicle>>(vehicleService.findByModel(searchParam), HttpStatus.OK);
	}
	
	@RequestMapping(value="/getVehicleByGearBox/{searchParam}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getVehicleByGearBox(@PathVariable String searchParam) {
		return new ResponseEntity<List<Vehicle>>(vehicleService.findByGearBox(searchParam), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{param}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getVehicle(@PathVariable("param") Long id) {
		return new ResponseEntity<Vehicle>(vehicleService.findByID(id), HttpStatus.OK);
	}
	
	@PutMapping()
	public ResponseEntity<Vehicle> updateVehicle(@RequestBody VehicleDTO vehicle ) {
		
		return new ResponseEntity<Vehicle>(vehicleService.update(vehicle), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{param}")
	public ResponseEntity<Void> deleteVehicle(@PathVariable("param") Long id) {
		vehicleService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

	

}
