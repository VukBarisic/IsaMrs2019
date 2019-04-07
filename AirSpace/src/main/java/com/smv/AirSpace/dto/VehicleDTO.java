package com.smv.AirSpace.dto;

public class VehicleDTO {
	
	private String model;
	private int numOfSeats;
	private String gearBox;
	
	
	public VehicleDTO() {
		super();
	}
	public VehicleDTO(String model,String gearBox, int numOfSeats) {

		this.model = model;
		this.gearBox = gearBox;
		this.numOfSeats = numOfSeats;
	}
	
	public String getGearBox() {
		return gearBox;
	}
	
	public void setGearBox(String gearBox) {
		this.gearBox = gearBox;
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
