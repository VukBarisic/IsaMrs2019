package com.smv.AirSpace.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smv.AirSpace.model.BranchOffice;
import com.smv.AirSpace.model.Rentacar;
import com.smv.AirSpace.service.BranchOfficeService;
import com.smv.AirSpace.service.RentacarServiceImpl;

@RestController
@RequestMapping(value = "/branchOffice")
public class BranchOfficeController {

	@Autowired
	BranchOfficeService branchOfficeService;

	@Autowired
	RentacarServiceImpl rentaCarService;

	@PreAuthorize("hasAuthority('RENTACAR_ADMIN')")
	@GetMapping("/admin")
	public List<BranchOffice> getBranchOffices(Principal principal) {
		System.out.println("USAO U GETBRANCHOFFICE");
		List<BranchOffice> branchOffices = new ArrayList<BranchOffice>();
		Rentacar rentaCar = rentaCarService.getLoggedAdminRentacar(principal);
		branchOffices = rentaCar.getBranchOffices();
		return branchOffices;

	}

	@DeleteMapping(value = "/{param}")
	public ResponseEntity<Void> deleteOffice(@PathVariable("param") Long id) {
		branchOfficeService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
