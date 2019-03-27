package com.smv.model;

import org.springframework.data.geo.Point;

import javax.persistence.*;

@Entity
@Table (name = "location")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	protected Address address;
	protected double x;
	protected double y;



	public  Location(){

	}

	public Location(Long id, Address address, double x, double y) {
		this.id = id;
		this.address = address;
		this.x = x;
		this.y = y;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
