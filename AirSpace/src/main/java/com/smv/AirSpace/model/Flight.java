package com.smv.AirSpace.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String flightNumber;
	private String airplaneModel;
	private String fromAirportId;
	private String toAirportId;
	private LocalDateTime departureDateTime;
	private LocalDateTime arrivalDateTime;


	public Flight(){

	}

	public Flight(Long id, String flightNumber, String airplaneModel, String fromAirportId, String toAirportId, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime) {
		this.id = id;
		this.flightNumber = flightNumber;
		this.airplaneModel = airplaneModel;
		this.setFromAirportId(fromAirportId);
		this.setToAirportId(toAirportId);
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

	public String getAirplaneModel() {
		return airplaneModel;
	}

	public void setAirplane(String airplaneModel) {
		this.airplaneModel = airplaneModel;
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

	public String getFromAirportId() {
		return fromAirportId;
	}

	public void setFromAirportId(String fromAirportId) {
		this.fromAirportId = fromAirportId;
	}

	public String getToAirportId() {
		return toAirportId;
	}

	public void setToAirportId(String toAirportId) {
		this.toAirportId = toAirportId;
	}
}
