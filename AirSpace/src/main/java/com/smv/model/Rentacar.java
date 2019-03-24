package com.smv.model;

import java.util.List;

public class Rentacar {
	
	private Long id;
	private String name;
	private String description;
	private double rating;
	private List<BranchOffice> branchOffices;

	public Rentacar(){

	}
	
	
	
	public Rentacar(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		this.rating = 0.0;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public List<BranchOffice> getBranchOffices() {
		return branchOffices;
	}

	public void setBranchOffices(List<BranchOffice> branchOffices) {
		this.branchOffices = branchOffices;
	}
}