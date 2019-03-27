package com.smv.dto;

public class VehicleDTO {
	
	private String model;
	private int numOfSeats;
	
	
	public VehicleDTO() {
		super();
	}
	public VehicleDTO(String model, int numOfSeats) {
		super();
		this.model = model;
		this.numOfSeats = numOfSeats;
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
	
	

}
