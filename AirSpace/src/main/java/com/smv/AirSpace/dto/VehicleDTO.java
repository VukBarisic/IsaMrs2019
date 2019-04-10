package com.smv.AirSpace.dto;

public class VehicleDTO {
	
	private String model;
	private int numOfSeats;
	private String gearBox;
	private int godinaProizvodnje;
	private long id;
	private Long idOffice;
	private int pricePerDay;
	
	
	public VehicleDTO() {
		super();
	}
	public VehicleDTO(String model,String gearBox, int numOfSeats, int godinaProizvodnje, Long idOffice, int pricePerDay) {

		this.model = model;
		this.gearBox = gearBox;
		this.numOfSeats = numOfSeats;
		this.godinaProizvodnje = godinaProizvodnje;
		this.idOffice = idOffice;
		this.pricePerDay = pricePerDay;
		
	}
	public VehicleDTO(long id, String model,String gearBox, int numOfSeats, int godinaProizvodnje, Long idOffice, int pricePerDay) {

		this.model = model;
		this.gearBox = gearBox;
		this.numOfSeats = numOfSeats;
		this.godinaProizvodnje = godinaProizvodnje;
		this.idOffice = idOffice;
		this.pricePerDay = pricePerDay;
		this.id = id;
		
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public Long getIdOffice() {
		return idOffice;
	}
	public void setIdOffice(Long idOffice) {
		this.idOffice = idOffice;
	}
	public int getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(int pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	

}
