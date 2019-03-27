package com.smv.model;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table (name = "flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String flightNumber;
	private Airplane airplane;
	private Airport From;
	private Airport To;
	private LocalDateTime departureDateTime;
	private LocalDateTime arrivalDateTime;


	public Flight(){

	}

	public Flight(Long id, String flightNumber, Airplane airplane, Airport from, Airport to, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime) {
		this.id = id;
		this.flightNumber = flightNumber;
		this.airplane = airplane;
		From = from;
		To = to;
		this.departureDateTime = departureDateTime;
		this.arrivalDateTime = arrivalDateTime;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public Airport getFrom() {
		return From;
	}

	public void setFrom(Airport from) {
		From = from;
	}

	public Airport getTo() {
		return To;
	}

	public void setTo(Airport to) {
		To = to;
	}

	public LocalDateTime getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(LocalDateTime departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}
}
