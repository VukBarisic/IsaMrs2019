package com.smv.AirSpace.model;

import java.util.Map;

import javax.persistence.*;

import com.smv.AirSpace.dto.VehicleDTO;


@Entity
@Table (name = "vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String model;
	private String gearBox;
	private int numOfSeats;
	private int godinaProizvodnje;
	private boolean available;
	private double rating;
	
	private Long idUser;
	private Long idOffice;
	private String cityLocation;
	private int pricePerDay;
	
	
	public Vehicle() {
	}

	public Vehicle(Long id, String model, int numOfSeats,String gearBox, boolean available, double rating) {
		this.id = id;
		this.model = model;
		this.gearBox = gearBox;
		this.numOfSeats = numOfSeats;
		this.available = available;
		this.rating = rating;
	}
	
	public Vehicle(Long id, String model, String gearBox, int numOfSeats, int godinaProizvodnje, Long idOffice, int pricePerDay) {
		this.id = id;
		this.model = model;
		this.gearBox = gearBox;
		this.numOfSeats = numOfSeats;
		this.godinaProizvodnje = godinaProizvodnje;
		this.available = true;
		this.rating = 100.0;
		this.idOffice = idOffice;
		this.pricePerDay = pricePerDay;
	}
	
	public Vehicle(VehicleDTO dto) {
		this.id = dto.getId();
		this.model = dto.getModel();
		this.gearBox = dto.getGearBox();
		this.numOfSeats = dto.getNumOfSeats();
		this.godinaProizvodnje = dto.getGodinaProizvodnje();
		this.idOffice = dto.getIdOffice();
		this.pricePerDay = dto.getPricePerDay();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getGearBox() {
		return gearBox;
	}

	public void setGearBox(String gearBox) {
		this.gearBox = gearBox;
	}

	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Long getIdOffice() {
		return idOffice;
	}

	public void setIdOffice(Long idOffice) {
		this.idOffice = idOffice;
	}

	public String getCityLocation() {
		return cityLocation;
	}

	public void setCityLocation(String cityLocation) {
		this.cityLocation = cityLocation;
	}

	public int getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(int pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	
	
	
	

}
