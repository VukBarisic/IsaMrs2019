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
	private boolean occupied;
	private SeatType seatType;
	

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seat(Long id, int row, String column, boolean occupied, SeatType seatType) {
		super();
		this.id = id;
		this.row = row;
		this.column = column;
		this.occupied = occupied;
		this.seatType = seatType;
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


	public boolean isOccupied() {
		return occupied;
	}


	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}


	public SeatType getSeatType() {
		return seatType;
	}


	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	


}

