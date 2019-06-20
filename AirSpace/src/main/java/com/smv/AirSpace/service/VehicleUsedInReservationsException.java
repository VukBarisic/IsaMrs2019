package com.smv.AirSpace.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST)
public class VehicleUsedInReservationsException extends RuntimeException  {
	
	public VehicleUsedInReservationsException(){
		  super("BranchOffice with specified id is already in use.");
	  }
	private static final long serialVersionUID = 1L;
}
