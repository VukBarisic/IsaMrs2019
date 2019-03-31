package com.smv.AirSpace.model;

import javax.persistence.*;

@Entity
@Table (name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String street;
	private String city;
	private String postCode;
	private String State;


	public Address(){

	}

	public Address(Long id, String street, String city, String postCode, String state) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.postCode = postCode;
		State = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}
}
