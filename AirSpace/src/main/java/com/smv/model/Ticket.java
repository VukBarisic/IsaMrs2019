package com.smv.model;

public class Ticket {
	
	private Long id;
	private double price;
	private double discount;
	private Flight flight;
	private Seat seat;

	public Ticket(){

	}


	public Ticket(Long id, double price, double discount, Flight flight, Seat seat) {
		this.id = id;
		this.price = price;
		this.discount = discount;
		this.flight = flight;
		this.seat = seat;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}
}
