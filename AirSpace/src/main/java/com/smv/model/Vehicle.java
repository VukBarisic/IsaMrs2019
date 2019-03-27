package com.smv.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String model;
	private int numOfSeats;
	private boolean available;
	private double rating;
	
	public Vehicle() {
	}

	public Vehicle(Long id, String model, int numOfSeats, boolean available, double rating) {
		this.id = id;
		this.model = model;
		this.numOfSeats = numOfSeats;
		this.available = available;
		this.rating = rating;
	}
	
	public Vehicle(Long id, String model, int numOfSeats) {
		this.id = id;
		this.model = model;
		this.numOfSeats = numOfSeats;
		this.available = true;
		this.rating = 100.0;
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
	
	
	
	
	

}
