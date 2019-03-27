package com.smv.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private int number;	
	private int floor;
	private RoomType roomType;
	private int numOfBeds;
	private double price;
	private double rating;
	private boolean available;
	
	public Room() {
	
	}

	public Room(Long id, int number, int floor, RoomType roomType, int numOfBeds, double price, double rating,
			boolean available) {
		
		this.id = id;
		this.number = number;
		this.floor = floor;
		this.roomType = roomType;
		this.numOfBeds = numOfBeds;
		this.price = price;
		this.rating = rating;
		this.available = available;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public int getNumOfBeds() {
		return numOfBeds;
	}
	public void setNumOfBeds(int numOfBeds) {
		this.numOfBeds = numOfBeds;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
}
