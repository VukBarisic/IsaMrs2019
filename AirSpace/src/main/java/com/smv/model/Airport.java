package com.smv.model;

public class Airport {
	
	private Long id;
	private String name;
	private String label;
	private Location location;

	public Airport(){

	}

	public Airport(Long id, String name, String label, Location location) {
		this.id = id;
		this.name = name;
		this.label = label;
		this.location = location;
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}
