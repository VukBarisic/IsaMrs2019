package com.smv.AirSpace.dto;

import java.util.Date;

import com.smv.AirSpace.model.Rentacar;
import com.smv.AirSpace.model.User;
import com.smv.AirSpace.model.Vehicle;

public class ReservationRentaCarDTO {
	
	private Long id;	
	private Long rentacarId;
	private Long userId;
	private Long vehicleId;	
	private Date dateFrom;
	private Date dateUntil;
	
	
	
	private Rentacar rentacar;
	private User user;
	private Vehicle vehicle;
	
	
	public ReservationRentaCarDTO(Long id, Long rentacarId, Long userId, Long vehicleId, Date dateFrom,
			Date dateUntil) {
		super();
		this.id = id;
		this.rentacarId = rentacarId;
		this.userId = userId;
		this.vehicleId = vehicleId;
		this.dateFrom = dateFrom;
		this.dateUntil = dateUntil;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getRentacarId() {
		return rentacarId;
	}
	public void setRentacarId(Long rentacarId) {
		this.rentacarId = rentacarId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateUntil() {
		return dateUntil;
	}
	public void setDateUntil(Date dateUntil) {
		this.dateUntil = dateUntil;
	}
	public Rentacar getRentacar() {
		return rentacar;
	}
	public void setRentacar(Rentacar rentacar2) {
		this.rentacar = rentacar2;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
}
