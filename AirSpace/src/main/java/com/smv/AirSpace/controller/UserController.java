package com.smv.AirSpace.controller;

import com.smv.AirSpace.dto.RegisterUserEditDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.smv.AirSpace.dto.UserDTO;
import com.smv.AirSpace.model.User;
import com.smv.AirSpace.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	// Create new user.
	@PostMapping( consumes = "application/json")
	public ResponseEntity<User> addUser(@RequestBody UserDTO userDTO) {
		System.out.println("usao u controler");
		User user = userService.saveUser(userDTO);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/updateRegisterUser", method = RequestMethod.PUT)
	public ResponseEntity updateRegUser(@RequestBody RegisterUserEditDTO registerUserEditDTO) {
		boolean updated = userService.update(registerUserEditDTO);

		if(updated){
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		}
		return new ResponseEntity<Boolean>(false,HttpStatus.OK);
	}



/*
	// Get all vehicles
	@GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getVehicles() {
		try {
			return new ResponseEntity<List<Vehicle>>(vehicleService.getAllVehicles(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

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
*/	

}
