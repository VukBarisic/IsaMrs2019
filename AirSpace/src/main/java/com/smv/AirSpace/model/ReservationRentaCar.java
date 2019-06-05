package com.smv.AirSpace.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.smv.AirSpace.dto.ReservationRentaCarDTO;

@Entity
@Table (name = "reservationrentacar")
public class ReservationRentaCar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;	
	@ManyToOne()
	private Rentacar rentacar;
	@ManyToOne()
	private User user;
	@ManyToOne()
	private Vehicle vehicle;	
	private Date dateFrom;
	private Date dateUntil;
	
	
	
	
	
	public ReservationRentaCar() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ReservationRentaCar(Long id, Rentacar rentacar, User user, Vehicle vehicle, Date dateFrom, Date dateUntil) {
		super();
		this.id = id;
		this.rentacar = rentacar;
		this.user = user;
		this.vehicle = vehicle;
		this.dateFrom = dateFrom;
		this.dateUntil = dateUntil;
	}



	public ReservationRentaCar(ReservationRentaCarDTO dto) {
		this.id = dto.getId();
		this.rentacar = dto.getRentacar();
		this.user = dto.getUser();
		this.vehicle = dto.getVehicle();
		this.dateFrom = dto.getDateFrom();
		this.dateUntil = dto.getDateUntil();

	}

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Rentacar getRentacar() {
		return rentacar;
	}
	public void setRentacar(Rentacar rentacar) {
		this.rentacar = rentacar;
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
	
	
}
