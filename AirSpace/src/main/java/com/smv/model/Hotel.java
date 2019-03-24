package com.smv.model;

import java.util.List;

public class Hotel {
	
	private Long id;
	private String name;
	private int stars;
	private String description;
	private double rating;
	private Location location;
	private List<Room> rooms;
	
	
	
	
	
	
	public Hotel() {
	}

	public Hotel(Long id, String name, int stars, String description, double rating, Location location) {
		this.id = id;
		this.name = name;
		this.stars = stars;
		this.description = description;
		this.rating = rating;
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

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	

}
