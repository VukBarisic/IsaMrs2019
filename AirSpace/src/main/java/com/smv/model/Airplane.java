package com.smv.model;


public class Airplane {
	
	private Long id;
	private String model;
	private TravelClass firstClass;
	private TravelClass businessClass;
	private TravelClass economyClass;


	public Airplane(){

	}

	public Airplane(Long id, String model, TravelClass firstClass, TravelClass businessClass, TravelClass economyClass) {
		this.id = id;
		this.model = model;
		this.firstClass = firstClass;
		this.businessClass = businessClass;
		this.economyClass = economyClass;
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

	public TravelClass getFirstClass() {
		return firstClass;
	}

	public void setFirstClass(TravelClass firstClass) {
		this.firstClass = firstClass;
	}

	public TravelClass getBusinessClass() {
		return businessClass;
	}

	public void setBusinessClass(TravelClass businessClass) {
		this.businessClass = businessClass;
	}

	public TravelClass getEconomyClass() {
		return economyClass;
	}

	public void setEconomyClass(TravelClass economyClass) {
		this.economyClass = economyClass;
	}
}
