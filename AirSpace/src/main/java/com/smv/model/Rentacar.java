package com.smv.model;

import java.util.List;

public class Rentacar {
	
	private Long id;
	private String name;
	private String description;
	private double rating;
	private List<BranchOffice> branchOffices;
	
	
	
	public Rentacar(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		this.rating = 0.0;
	}
	
	

}
