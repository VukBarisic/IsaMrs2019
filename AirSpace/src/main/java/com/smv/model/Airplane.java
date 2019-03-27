package com.smv.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "airplane")
public class Airplane {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	private String model;
	private List<Seat> seats;

	public Airplane(){

	}

	public Airplane(Long id, String model, List<Seat> seats) {
		this.id = id;
		this.model = model;
		this.seats = seats;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}







}
