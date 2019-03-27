package com.smv.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private int row;
	private String column;
	private TravelClass travelClass;
	private boolean occupied;

	public Seat(){

	}


	public Seat(Long id, int row, String column, TravelClass travelClass, boolean occupied) {
		this.id = id;
		this.row = row;
		this.column = column;
		this.travelClass = travelClass;
		this.occupied = occupied;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public TravelClass getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(TravelClass travelClass) {
		this.travelClass = travelClass;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
}
