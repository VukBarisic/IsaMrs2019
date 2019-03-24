package com.smv.model;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Flight {
	
	private Long id;
	private String flightNumber;
	private Airplane airplane;
	private Airport From;
	private Airport To;
	private LocalDateTime departureDateTime;
	private LocalDateTime arrivalDateTime;
	

}
