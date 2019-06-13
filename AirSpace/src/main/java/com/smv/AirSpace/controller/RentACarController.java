package com.smv.AirSpace.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smv.AirSpace.dto.RentacarDTO;
import com.smv.AirSpace.model.Rentacar;
import com.smv.AirSpace.service.RentacarServiceImpl;
import com.smv.AirSpace.service.UserServiceImpl;

@RestController
@RequestMapping(value = "/rentacar")
public class RentACarController {
	
	@Autowired
	RentacarServiceImpl rentaCarService;
	
	@Autowired
	UserServiceImpl userService;
	
	
	@GetMapping("/admin")
	public ResponseEntity<?> getLoggedUserRentaCarCompany(Principal principal){
		
		Rentacar rentaCar = rentaCarService.getLoggedAdminRentacar(principal);
		if(rentaCar!=null) {
			return new ResponseEntity<RentacarDTO>(new RentacarDTO(rentaCar), HttpStatus.OK);
		} 
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping()
	public ResponseEntity<Rentacar> updateRentACar(@RequestBody RentacarDTO rentaCar) {
		return new ResponseEntity<Rentacar>(rentaCarService.update(rentaCar), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{param}")
	public ResponseEntity<?> deleteRentACar(@PathVariable("param") Long id) {
		rentaCarService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	

	
}
